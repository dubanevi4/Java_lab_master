import java.lang.reflect.Array;
import java.util.Arrays;

public class Excercise_22 {
    public static void main(String[] args){
    int[][] a = {{3, 2, 1}, {9, 8, 7}, {2, -1, 87}, {0, 14, -21}};
    int[][] b = Solution_22.transpose(a);
        System.out.println(Arrays.deepToString(b));
    }
}

class Solution_22 {

    /**
     * @param a m x n matrix
     * @return the transpose matrix
     */
    public static int[][] transpose(int[][] a) {
        //put your code here
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}
