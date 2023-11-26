import java.util.Arrays;

public class Excercise_7 {
    public static void main(String[] args){
        int n = 4;
        int[][] b = Solution_7.create(n);
        System.out.println(Arrays.deepToString(b));
    }
}

class Solution_7 {

    /**
     * @param n the given positive number
     * @return the square bottom triangle n x n matrix filled with 1
     */
    public static int[][] create(int n) {
        //put your code here
        int count = 0;
        int[][] a = new int [n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j){
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        return a;
    }
}