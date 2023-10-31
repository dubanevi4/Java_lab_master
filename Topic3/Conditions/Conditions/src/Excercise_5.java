//Given floating point numbers a, b and x,
// output the absolute value of the expression a * x + b, rounded to three decimal places.
//Do not use methods from the class Math.
import java.util.Scanner;
public class Excercise_5 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double x = sc.nextDouble();
            double c = a * x + b;
            if (c < 0){
                c *= -1;
            }
            System.out.printf("%.3f", c);
        }
    }
}
