package Excercise1;

public class Book {
    private final String title;

    //Constructor for outer class Excercise1.Book
    public Book (String title){
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    class Author{
        private final String name;

        //Constructor for inner class Author
        public Author(String name){
            this.name = name;
        }

        public String getName(){
            return this.name;
        }
    }
}

class Executor{
    public static Book createBook(String title){
        return new Book(title);
    }

    public static Book.Author createAuthor(Book book, String name){
        return book.new Author(name);
    }
}
