/**
 * @param a the given array
 * @param k > 0 the given number
 * @return an array containing the first k positive elements of the array a
 */
import java.util.Arrays;

public class Array_Exc_1 {
    public static void main(String[] args){
        int[] a = {1,-3, 2, 0, -1, -1, 2, 10, 0};
        int k = 3;
        System.out.println(Arrays.toString(Solution.getResult(a,k)));
    }
}

class Solution {
    public static int [] getResult(int[] a, int k) {
        int[] newArray = new int [k];
        int index = 0;
        for (int i = 0; i < a.length; i++){
            if (index < newArray.length){
                if (a[i] > 0){
                    newArray[index] = a[i];
                    index++;
                }
            } else {
                break;
            }
        }
        return newArray;
    }
}


