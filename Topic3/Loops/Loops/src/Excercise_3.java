//Given a digit d > 1.
//Output the product of each digit by d in ascending order.

import java.util.Scanner;
public class Excercise_3 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            int d = sc.nextInt();
            int i = 0;
            do {
                System.out.println(i * d + " ");
                i++;
            } while (i < 10);
        }
    }
}

