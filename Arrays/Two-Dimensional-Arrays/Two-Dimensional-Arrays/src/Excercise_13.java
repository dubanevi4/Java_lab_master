import java.util.Arrays;

public class Excercise_13 {
    public static void main(String[] args){
        int n = 7;
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
        for (int i = 0; i <= n/2; i++) {
            int min = Math.min(i, n - i);
            int max = Math.max(i, n - i);
            for (int j = 0; j < n; j++) {
                if (j > min && j < max-1){
                    b[i][j] = 0;
                } else {
                    b[i][j] = 1;
                }
            }
        }
        for (int i = n/2+1; i < n; i++) {
            int min = Math.min(i, n - i);
            int max = Math.max(i, n - i);
            for (int j = 0; j < n; j++) {
                if (j >= min && j <= max-1){
                    b[i][j] = 0;
                } else {
                    b[i][j] = 1;
                }
            }
        }
        return b;
    }
}