import java.util.Arrays;

public class Excercise_13 {
    public static void main(String[] args){
        int n = 5;
        int[][] a = Solution_13.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_13 {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] b = new int[n][n];
        for (int[] row: b)
            Arrays.fill(row, 1);
        for (int i = 0, k = 1; i < n/2; i++, k++) {
            int min = Math.min(k, n - k);
            int max = Math.max(k, n - k);
            for (int j = min; j < max; j++) {
                b[i][j] = 0;
            }
        }
        for (int i = n/2+1, k = n/2+1; i < n; i++, k++) {
            int min = Math.min(k, n - k);
            int max = Math.max(k, n - k);
            for (int j = min; j < max; j++) {
                b[i][j] = 0;
            }
        }
        return b;
    }
}