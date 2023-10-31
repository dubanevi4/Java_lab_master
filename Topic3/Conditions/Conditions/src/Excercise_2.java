//Given integers a and b.
//Are they equal?

import java.util.Scanner;

public class Excercise_2 {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a == b) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}