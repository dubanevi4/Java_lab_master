import java.util.OptionalInt;

public class Exc1 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            int inputNumber = scanner.nextInt();
            OptionalInt optNumber = Solution.optionalNumber(inputNumber);
            System.out.println(optNumber.isEmpty()
                    ? false : inputNumber == optNumber.getAsInt());
        }

    }

    class Solution {
        static OptionalInt optionalNumber(int value) {

            if (value % 2 == 0) {
                return OptionalInt.of(value);
            } else {
                return OptionalInt.empty();
            }
        }
    }
}