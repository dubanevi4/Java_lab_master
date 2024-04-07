import java.util.Scanner;

class Manuscript {
    //declare instance constants
    private final String author;
    private final String name;


    //declare a parameterized constructor
    public Manuscript(String author, String name){
        this.author = author;
        this.name = name;
    }
    //override the method toString
    public String toString(){
        return String.format("%s;%s;%s",getClass().getSimpleName(), this.author,this.name);
    }
}

class PublishedBook extends Manuscript {
    //declare instance constants
    private final String publisher;
    private final String pagesNumber;

    //declare a parameterized constructor
    public PublishedBook(String author, String name, String publisher, String pagesNumber){
        super(author,name);
        this.publisher = publisher;
        this.pagesNumber = pagesNumber;
    }

    //override the method toString
    public String toString(){
        return super.toString() + ";" + this.publisher + ";" + this.pagesNumber;
    }
}

class ElectronicBook extends Manuscript {
    //declare instance constants
    private final String format;
    private final String size;
    //declare a parameterized constructor
    public ElectronicBook(String author, String name, String format, String size){
        super(author, name);
        this.format = format;
        this.size = size;
    }

    //override the method toString
    public String toString(){
        return super.toString() + ";" + this.format + ";" + this.size;
    }
}

class Solution {

    public static Manuscript getManuscript(String inputLine) {
        try (Scanner sc = new Scanner(inputLine)) {
            sc.useDelimiter(";");

            int id = sc.nextInt();
            //input other values from inputLine dependantly of the id value
            if (id == 1) {
                return new PublishedBook(sc.next(), sc.next(),sc.next(), sc.next());
            } else if (id == 2) {
                //create an instance of the Manuscript type(not class!) dependantly of the id value
                return new ElectronicBook(sc.next(), sc.next(),sc.next(), sc.next());
            }
            return new Manuscript(sc.next(), sc.next());
        }
    }
}