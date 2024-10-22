package Excercise1;

class Main {
    public static void main(String[] args) {
        //some hidden verification code here
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String line = sc.nextLine();
            String[] parts = line.strip().split(";");
            String inTitle = parts[0].strip();
            String inName = parts[1].strip();
            Book book = Executor.createBook(inTitle);
            String outTitle = book.getTitle();
            String outName = Executor.createAuthor(book, inName).getName();
            System.out.println(outTitle + ";" + outName);
        }
    }
}
