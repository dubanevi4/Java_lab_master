import java.util.Optional;

public class Exc2 {

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            String inputString = scanner.nextLine();
            Optional<String> optString = Solution.optionalString(inputString);
            System.out.println(optString.isPresent()
                    ? inputString.equals(optString.get()) : false);
        }
    }

    class Solution {
        static Optional<String> optionalString (String str) {
            if (str.length() >= 5) {
                return Optional.of(str);
            } else {
                return Optional.empty();
            }
        }
    }
}
