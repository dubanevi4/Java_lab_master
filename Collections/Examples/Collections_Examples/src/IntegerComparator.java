import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        if (o1.intValue() < o2.intValue()) {
            return 1;
        } else if (o1.intValue() > o2.intValue()) {
            return -1;
        }
        return 0;
    }
}
