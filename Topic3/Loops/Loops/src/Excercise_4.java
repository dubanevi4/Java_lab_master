//Given integers m and n, where m < n.
//Output even numbers between m and n inclusively in descending order.

import java.util.Scanner;
public class Excercise_4 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            while (n >= m) {
                if (n % 2 == 0){
                    System.out.print(n + " ");
                    n--;
                } else {
                    n--;
                }
            }
        }
    }
}
