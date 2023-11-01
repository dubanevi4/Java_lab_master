//Given three floating point numbers a, b, c.
//Output the sum of the biggest and smallest numbers among them to 3 decimal places.

import java.util.Scanner;
public class Excercise_14 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double sum;
            if (a >= b && a >= c){
                if (b < c){
                    sum = a + b;
                } else {
                    sum = a + c;
                }
                System.out.printf("%.3f", sum);
            }
            else if (b >= a && b >= c){
                if (a < c){
                    sum = b + a;
                } else {
                    sum = b + c;
                }
                System.out.printf("%.3f", sum);
            }
            else if (c >= a && c >= b){
                if (a < b){
                    sum = c + a;
                } else {
                    sum = c + b;
                }
                System.out.printf("%.3f", sum);
            }
        }
    }
}
