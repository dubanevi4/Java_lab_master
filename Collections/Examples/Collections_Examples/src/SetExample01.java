import java.util.*;

public class SetExample01 {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(Integer.parseInt("1"));
        set.add(3);
        set.add(null);
        set.add(5);
        set.add(6);
        set.add(null);
        set.add(8);
        set.add(Integer.parseInt("9"));
        set.add(8);

        System.out.println(set);

        for (Integer value : set) {
            System.out.print(value + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
