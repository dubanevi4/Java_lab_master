//Given a digit d.
//Output digits from d to 0 inclusively.

import java.util.Scanner;
public class Excercise_2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int d = sc.nextInt();
            while (d != 0){
                System.out.print(d + " ");
                d--;
            }
            System.out.println(d);
        }
    }
}
