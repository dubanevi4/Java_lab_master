import java.util.*;

public class MapExample01 {
    public static void main (String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");


        System.out.println(map);

        String value = map.get(3);
        System.out.println(value);

        Set<Integer> keys = map.keySet();
        for (Integer k: keys) {
            System.out.println(k + " - " + map.get(k));
        }
    }
}
