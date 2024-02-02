import java.util.*;


public class SetExample05 {
    public static void main(String[] args){
        Set<String> set = new TreeSet<>();

        set.add("White");
        set.add("Black");
        set.add("Red");
        set.add("Yellow");
        set.add("Orange");

        print(set);

        set.addAll(Arrays.asList("Green", "Blue", "Purple"));

        System.out.println("addAll: ");
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
