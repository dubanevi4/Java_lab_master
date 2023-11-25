import java.util.Arrays;

public class Excercise_4 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8},{0,0,2},{1,-1,-1},{9,1,7},{2,-8,5}};
        //int[][] a = {{7,-1,8},{0,0,2}};
        //int[][] a = {{1}};
        int[][] b = Solution_4.create(a);
        System.out.println(Arrays.deepToString(b));
    }
}

class Solution_4 {

    /**
     * @param a m x n matrix
     * @return the matrix containing even rows of the matrix a
     */
    public static int[][] create(int[][] a) {
        //put your code here
        int m = a.length;
        int n = a[0].length;
        if (m == 1){
            return a;
        } else {
            int[][] b = new int[(m+m%2)/2][n];
            b[0] = a[0];
            for (int i = 2; i < m; i += 2) {
                b[i/2] = a[i];
            }
            return b;
        }
    }
}
