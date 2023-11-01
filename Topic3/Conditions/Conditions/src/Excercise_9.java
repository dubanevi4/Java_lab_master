//Given two points on the plane A(x1, y1) and B(x2, y2),
// output 0 if they are equidistant from the origin,
// 1 if point A is closer than point B,
//and -1 otherwise. Do not use methods from the class Math.

import java.util.Scanner;

public class Excercise_9 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double aSqr = x1 * x1 + y1 * y1;
            double bSqr = x2 * x2 + y2 * y2;
            if (aSqr == bSqr) {
                System.out.println(0);
            } else if (aSqr < bSqr) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
