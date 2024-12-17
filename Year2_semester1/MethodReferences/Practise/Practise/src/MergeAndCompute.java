import java.util.Map;
import java.util.HashMap;

public class MergeAndCompute {
    public static void main(String[] args){
        String[] strings = {"aa", "bb", "aaa", "cc", "aa", "bbb"};
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.merge(s + 'a', 1, (o, n) -> o + n);
        }
        var result = map.compute("aaa", (k, v) -> k.length() + v);
        System.out.println(result);
    }
}
