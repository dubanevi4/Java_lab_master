/**
 * @param a the given array
 * @param k > 0 the given number
 * @return an array containing the first k positive elements of the array a
 */

import java.util.Scanner;
import java.util.Arrays;

public class Excercise_1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int[] array = new int[a];
            int i = 0;
            while (i < a){
                int k = sc.nextInt();
                if (k > 0){
                    array[i] = k;
                    i++;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
