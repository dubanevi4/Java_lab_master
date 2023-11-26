import java.util.Arrays;

public class Excercise_8 {
    public static void main(String[] args){
        int n = 4;
        int[][] a = Solution_8.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_8 {

    /**
     * @param n the given positive number
     * @return the bottom triangle 2 dimensional array with n rows filled with 1
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] a = new int [n][];
        for (int i = 0; i < n; i++) {
            a[i] = new int[i + 1];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 1;
            }
        }
        return a;
    }
}