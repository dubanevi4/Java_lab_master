import java.util.Arrays;

public class Array_Exc_6 {
    public static void main(String[] args){
        int[] a = {1, 4, 2, 1, 0, 6, 4, 7};
        System.out.println(Arrays.toString(Solution_6.getResult(a)));
    }
}


class Solution_6 {

    /**
     * @param a the given array
     * @return an array, its i-th element = 1 if a[i] > i, otherwise = 0
     */
    public static int[] getResult(int[] a) {
        //put your code here
        int[] b = new int[a.length];
        for (int i=0; i < a.length; i++){
            if (i < a[i]){
                b[i] = 1;
            }
            else b[i] = 0;
        }
        return b;
    }
}