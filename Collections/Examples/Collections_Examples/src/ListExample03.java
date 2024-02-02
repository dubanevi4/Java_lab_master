import java.util.*;

public class ListExample03 {
    public static void main (String[] arg){
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list .add(Integer.parseInt("2"));
        list.add(3);
        list.add(null);
        list.add(5);
        list.add(6);
        list.add(null);
        list.add(8);
        list.add(Integer.parseInt("9"));

        print(list);

//        list.add(11,111); //error
//        print(list);
    }

    public static void print(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value + " ");
        }
        System.out.println();
    }
}
