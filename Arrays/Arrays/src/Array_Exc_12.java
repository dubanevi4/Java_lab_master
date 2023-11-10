import java.util.Arrays;

public class Array_Exc_12 {
    public static void main(String[] args){
        int[] a = {1, 1, 8, 7};
        Solution_12.compress(a);
        System.out.println(Arrays.toString(a));
    }
}

class Solution_12 {

    /**
     * method compresses the array
     * by shifting elements with even indices to the first half of the array
     * and replacing the rest of the array with zeros.
     *
     * @param a the given array
     */
    public static void compress(int[] a) {
        //put your code here
        int[] b = new int [a.length];
        b[0] = a[0];
        for (int i = 2; i < a.length; i++){
            if (i % 2 == 0){
                b[i/2] = a[i];
            }
        }
        for (int i = 0; i < a.length; i++){
            a[i] = b[i];
        }
    }
}
