//Given floating point numbers a and b and an integer n, where a < b, n > 1.
//Output values of a function f(x) to 3 decimal places on the segment [a, b] in n equidistant points.
//f(x) = 1 + 2 * sin(x).

import java.util.Scanner;
public class Excercise_9 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            int n = sc.nextInt();
            float step = (Math.abs(a) + Math.abs(b)) / (n-1);
            for (float i = a; i <= b; i += step){
                System.out.printf("%.3f ", 1 + 2 * Math.sin(i));
            }
        }
    }
}
