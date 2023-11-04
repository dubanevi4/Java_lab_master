//Given a positive integer n.
//Output divisors of n in ascending order.

import java.util.Scanner;

public class Excercise_14 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int divisor = 1;
            while (divisor <= n){
                if (n % divisor == 0){
                    System.out.print(divisor + " ");
                    divisor++;
                } else {
                    divisor++;
                }
            }
        }
    }
}
