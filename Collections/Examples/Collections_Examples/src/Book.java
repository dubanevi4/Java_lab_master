import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private int price;

    public Book(String title, int price){
        super();
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }


    public boolean equils(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Book other = (Book) obj;
        if (price != other.price){
            return false;
        }
        if (title == null){
            if (other.title != null){
                return false;
            }
        } else if ( !title.equals(other.title)){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return "Book [title=" + title + ", price =" + price + "]";
    }

    public int compareTo(Book o){
        return this.price - o.price;
    }
}
