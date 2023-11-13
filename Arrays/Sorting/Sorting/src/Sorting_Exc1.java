import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting_Exc1 {
    public static void main(String[] args){
        int[] a = {4, 8, 6, 2, 5};
        int k = 1;
        Solution.sort(a,k);
        System.out.println(Arrays.toString(a));
    }
}


class Solution {

    /**
     * method partially sorts an array by ascending order
     * with the direct selection sort algorithm
     *
     * NOTE: partially means that the minimal k elements of the array
     * are ordered after k iterations
     *
     * @param a the given array
     * @param k the given number of iterations, 0 < k < a.length
     */
    public static void sort(int[] a, int k) {
        //put your code here

        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < k; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }
}
