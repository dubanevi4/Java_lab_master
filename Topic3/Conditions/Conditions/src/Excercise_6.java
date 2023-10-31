//Determine whether the integers a, b, and c are equal.

import java.util.Scanner;
public class Excercise_6 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a == b && a == c) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
