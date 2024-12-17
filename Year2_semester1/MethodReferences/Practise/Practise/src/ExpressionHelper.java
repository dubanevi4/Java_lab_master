import java.util.function.IntPredicate;

public class ExpressionHelper {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    static boolean isPositive(int n) {
        return n > 0;
    }
}
class MethodReferenceDemo {
    private static int sum(int[] numbers, IntPredicate func) {
        int result = 0;
        for (int i : numbers) {
            if (func.test(i))
                result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        System.out.println(sum(nums, ExpressionHelper::isEven));
        IntPredicate expr = ExpressionHelper::isPositive;
        System.out.println(sum(nums, expr));
    }
}