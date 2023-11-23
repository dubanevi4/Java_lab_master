import java.util.Arrays;

public class Sorting_Exc2 {
    public static void main(String[] args){
        int[] a = {4, 8, 6, 2, 5};
        int k = 1;
        Solution_2.sort(a,k);
        System.out.println(Arrays.toString(a));
    }
}

class Solution_2 {

    /**
     * method partially sorts an array by ascending order
     * with the insertion sort algorithm
     *
     * NOTE: Partially means that the first (k + 1) elements of the array
     * are ordered after k iterations.
     *
     * @param a the given array
     * @param k the given number of iterations, 0 < k < a.length
     */
    public static void sort(int[] a, int k) {
        //put your code here
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            for (j >= 0 && a[j] > key; k < n; k++) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
}


