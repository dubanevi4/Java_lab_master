//Given a non-negative integer n.
//Output the factorial of n.

import java.util.Scanner;
public class Excercise_12 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            long result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            System.out.println(result);
        }
    }
}
