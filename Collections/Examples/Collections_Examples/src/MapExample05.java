import java.util.*;

public class MapExample05 {
    public static void main(String[] args){
        Map<String, String> map = new TreeMap<String, String>(new SurnameComparator());

        map.put("Ivanov", "123123");
        map.put("Petrov", "234234");
        map.put("Sidorov", "345345");
        map.put("Zhykov", "456456");

        System.out.println(map);

        Set< Map.Entry<String, String> > entries = map.entrySet();
        System.out.println(map);

        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println();

        Iterator< Map.Entry<String, String> > iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
