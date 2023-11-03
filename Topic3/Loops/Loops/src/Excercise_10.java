//Given a positive integer n.
//Output the sum 1/1 + 1/2 + 1/3 +... + 1/n to 3 decimal places.

import java.util.Scanner;
public class Excercise_10 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            double sum =0;
            for (int i = 1; i <= n; i++){
                sum += 1.0 / i;
            }
            System.out.printf("%.3f", sum);
        }
    }
}
