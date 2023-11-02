//Given a positive integer n.
//Output the sum of squares of numbers from 1 to n inclusively.

import java.util.Scanner;
public class Excercise_7 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int sum = 0;

            while (n != 0){
                sum += n * n;
                n--;
            }
            System.out.println(sum);
        }
    }
}
