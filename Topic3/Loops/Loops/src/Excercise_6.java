//Given a sequence of integers, containing the only number 0 at the end.
//Count the quantity of odd integers.

import java.util.Scanner;
public class Excercise_6 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int count = 0;

            while (sc.hasNextInt()){
                int num = sc.nextInt();
                if (num == 0)
                    break;
                if (num % 2 != 0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
