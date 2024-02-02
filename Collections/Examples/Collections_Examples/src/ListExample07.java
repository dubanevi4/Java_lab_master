

import java.util.*;

public class ListExample07 {
    public static void main(String[] args){
        List<Book> list = new ArrayList<Book>();

        list.add(new Book("Java", 300));
        list.add(new Book("C#", 300));
        list.add(new Book("C++", 200));

        print(list);

        //sort by price
        Collections.sort(list);
        print(list);

        //sort by titile
        Collections.sort(list,new BookComparator());
        print(list);
    }

    public static void print(List<Book> list) {
        Iterator<Book> iterator = list.iterator();
        while(iterator.hasNext()){
            Book value = iterator.next();
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
