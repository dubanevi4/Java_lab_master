//Given a non-negative long integer n.
//Output its most significant digit.

import java.util.Scanner;

public class Excercise_15 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            long n = sc.nextLong();
            long result;
            for (result = n; result >= 10; result /= 10);
            System.out.println(result);
        }
    }
}
