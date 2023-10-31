//Given integers a and b.
//Output the number whose square is less or equal the other one.
import java.util.Scanner;
public class Excercise_4 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a * a >= b * b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}
