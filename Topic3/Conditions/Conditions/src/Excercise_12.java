//Given the integers a and b, if a < b,
// exchange their values one for the other, and output a and then b.

import java.util.Scanner;
public class Excercise_12 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < b){
                int c = a;
                a = b;
                b = c;
            }
            System.out.printf("%d %d", a, b);
        }
    }
}
