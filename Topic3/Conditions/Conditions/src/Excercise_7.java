//Given two rectangles with sides x1, y1 and x2, y2, respectively.
//Output 0, if their areas are equal,
//1 if the area of rectangle 1 is greater than the area of rectangle 2,
//and -1 otherwise.
//Input data are correct.
import java.util.Scanner;
public class Excercise_7 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            if (x1 * y1 > x2 * y2) {
                System.out.println(1);
            } else if (x1 * y1 == x2 * y2) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
