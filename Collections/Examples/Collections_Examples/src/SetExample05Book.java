import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample05Book {
    public static void main(String[] args){
        Set<Book> set = new TreeSet<Book>();

        set.add(new Book("Java", 300));
        set.add(new Book("C#", 200));
        set.add(new Book("C++", 400));

        print(set);
    }

    public static void print(Set<Book> list) {
        Iterator<Book> iterator = list.iterator();
        while(iterator.hasNext()){
            Book value = iterator.next();
            System.out.println((value + " "));
        }
        System.out.println();
    }
}

