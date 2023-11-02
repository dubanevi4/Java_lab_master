//Given a sequence of integers, containing the only number 0 at the end.
//Output its sum.

import java.util.Scanner;

public class Excercise_5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int count = 0;

            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num == 0)
                    break;
                sum += num;
            }
            System.out.println(sum);
        }
    }
}
