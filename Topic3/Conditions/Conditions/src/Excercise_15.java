//Given integers a, b, c, d.
//Output max{min(a, b), min(c, d)}.

import java.util.Scanner;
public class Excercise_15 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int min1;
            int min2;
            if (a < b) {
                min1 = a;
            } else {
                min1 = b;
            }
            if (c < d) {
                min2 = c;
            } else {
                min2 = d;
            }
            if (min1 > min2) {
                System.out.println(min1);
            } else {
                System.out.println(min2);
            }
        }
    }
}
