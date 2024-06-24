import java.util.*;

public class test{
    public static void main(String[] args){
        Set<String> strings1 = new HashSet<>();
        strings1.add("C33");

        strings1.add("A11");

        strings1.add("B22");
        System.out.print(strings1);
        Set<String> strings2 = new LinkedHashSet<>();
        strings2.add("C33");

        strings2.add("A11");

        strings2.add("B22");
        System.out.println(strings2);

    }
}
