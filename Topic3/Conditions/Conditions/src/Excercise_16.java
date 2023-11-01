//Given floating point numbers a, b, c, d.
//Output max{d - a, d - b, d - c} to 3 decimal places.

import java.util.Scanner;
public class Excercise_16 {
    public static void main(String[] args){
        try ( Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double max1;
            double max2;
            double max3;
            max1 = d - a;
            max2 = d - b;
            max3 = d - c;
            if (max1 > max2 && max1 > max3) {
                System.out.printf("%.3f", max1);
            } else if (max2 > max1 && max2 > max3){
                System.out.printf("%.3f", max2);
            } else {
                System.out.printf("%.3f", max3);
            }
        }
    }
}
