import java.util.*;

public class ListExample04 {
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

        list.addAll(Arrays.asList(10,11,12));
        System.out.println("addAll: ");
        print(list);

        System.out.println("contains: null  " + list.contains(null));
        System.out.println("containsAll: null,8,6  " + list.containsAll(Arrays.asList(null,8,6)));
        System.out.println("isEmpty: " + list.isEmpty());

        list.remove(0);
        print(list);

        list.sort(new IntegerComparator());
        print(list);

}

    public static void print(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
