import java.util.Arrays;

public class Sorting_Exc3 {

    public static void main(String[] args){
        int[] a = {4, 8, 6, 2, 5};
        int k = 6;
        Solution_3.sort(a,k);
        System.out.println(Arrays.toString(a));
    }
}

class Solution_3 {

    /**
     * method partially sorts an array by ascending order
     * with the bubble sort algorithm
     *
     * NOTE: Partially means that the bubble sort algorithm ends
     * after the earlier of two possible events:
     * 1) the array is sorted, 2) k swaps are done.
     *
     * @param a the given array
     * @param k the given number of swaps, k > 0
     */
    public static void sort(int[] a, int k) {
        //put your code here
        int n = a.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1 && k > 0; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                    k--;
                }
            }
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false){
                break;
            }
        }
    }
}

