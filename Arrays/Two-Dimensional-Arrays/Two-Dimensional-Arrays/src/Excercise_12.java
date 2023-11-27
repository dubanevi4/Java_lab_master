import java.util.Arrays;

public class Excercise_12 {
    public static void main(String[] args){
        int n = 6;
        int[][] a = Solution_12.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_12 {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] b = new int[n][n];
        for (int i = 0, k = 0; i < n; i++, k++) {
            int min = Math.min(k, n - k);
            int max = Math.max(k, n - k);
            for (int j = min; j < max; j++) {
                b[i][j] = 1;
            }
        }
        return b;
    }
}
