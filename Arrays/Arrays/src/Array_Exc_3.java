import java.util.Arrays;

public class Array_Exc_3 {
    public static void main(String[] args){
        int m = 10;
        int[] a = {2, 15, -1, 20, 12, 5, 1, 0};
        System.out.println(Solution_3.getResult(a,m));
        System.out.println(Arrays.toString(a));

    }
}

class Solution_3 {

    /**
     * method replaces all elements of a that greater than m with m
     *
     * @param a the given array
     * @param m the given number
     * @return the number of replacements
     */
    public static int getResult(int[] a, int m) {
        //put your code here, update elements of the array a if needed
        int[] array1 = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                a[i] = m;
                count++;
            } else {
                a[i] = a[i];
            }
        }
        return count;
    }
}