import java.util.*;

public class SetExample04 {
    public static void main(String[] args){
        Set<String> set = new LinkedHashSet<>();

        set.add("White");
        set.add("Black");
        set.add("Red");
        set.add("Yellow");
        set.add("Orange");

        print(set);

        set.addAll(Arrays.asList("Green", "Blue", "Purple"));

        System.out.println("addAll: ");
        print(set);

        System.out.println("contains: " + set.contains(null));

        System.out.println("containsAll: " + set.containsAll(Arrays.asList(null, "Yellow")));

        System.out.println(("isEmpty: " + set.isEmpty()));

        set.remove("Black");
        System.out.println("remove: ");
        print(set);

        set.removeAll(Arrays.asList(null, "Yellow" ));
        System.out.println(("removeAll: "));
        print(set);
    }

    public static void print(Set<String> list) {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println((value + " "));
        }
        System.out.println();
    }
}
