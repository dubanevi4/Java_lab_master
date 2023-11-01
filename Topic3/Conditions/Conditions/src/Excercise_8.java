//Given a floating point number a.
//If a number is not negative, then output its square to 3 decimal places,
//otherwise its fourth power to 3 decimal places.

import java.util.Scanner;

public class Excercise_8 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            if (a >= 0) {
                a *= a;
            } else {
                a *= a * a * a;
            }
            System.out.printf("%.3f", a);
        }
    }
}
