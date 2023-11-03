//Given two integers m and n, where 33 <= m < n < 127.
//Output ASCII symbols with codes from m to n inclusively.

import java.util.Scanner;

public class Excercise_13 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int m = sc.nextInt();
            int n = sc.nextInt();
            for (int i = m; i <= n; i++){
                System.out.printf("%c", i);
            }
        }
    }

}
