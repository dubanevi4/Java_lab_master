//Given floating point numbers a, b and c.
//Count quantity of negative numbers among them.

import java.util.Scanner;
public class Excercise_10 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            int counter = 0;
            if (a < 0) {
                counter += 1;
            }
            if (b < 0) {
                counter += 1;
            }
            if (c < 0){
                counter += 1;
            }
            System.out.println(counter);
        }
    }
}
