//Given a digit d.
//Output digits from 0 to d inclusively.

import java.util.Scanner;
public class Excercise_1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            int d = sc.nextInt();
            int counter = 0;
            while (counter != d){
                System.out.println(counter + " ");
                counter += 1;
            }
            System.out.println(counter);
        }
    }
}
