//Given floating point numbers a, b, h, where a < b, h > 0.
//Output values of a function f(x) to 3 decimal places on the half-interval [a, b) with step h.
//f(x) = x if x > 2, otherwise 2 * x + 1.

import java.util.Scanner;

public class Excercise_8 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            for (double i = a; i < b; i += h) {
                if (i > 2){
                    System.out.printf("%.3f ", i);
                } else {;
                    System.out.printf("%.3f ", 2 * i +1);
                }
            }
        }
    }
}
