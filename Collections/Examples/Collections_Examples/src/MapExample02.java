import java.util.*;

public class MapExample02 {
    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();

        map.put("Ivanov", "123123");
        map.put("Petrov", "234234");
        map.put("Sidorov", "345345");
        map.put("Zhykov", "456456");

        System.out.println(map);

        Set<String> keys = map.keySet();
        for(String k : keys){
            System.out.println(k + " - " + map.get(k));
        }
    }
}
