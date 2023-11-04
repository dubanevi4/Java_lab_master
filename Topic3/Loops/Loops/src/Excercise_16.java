//Given a non-negative long integer n.
//Output the number of even digits in it.

import java.util.Scanner;
public class Excercise_16 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            long n = sc.nextLong();
            long result;
            int counter = 0;
            if (n == 0){
                counter++;
            }
            for (result = n; result >= 1; result /= 10){
                if (result % 2 == 0){
                    counter++;
                }
            }
            System.out.print(counter);
        }
    }
}
