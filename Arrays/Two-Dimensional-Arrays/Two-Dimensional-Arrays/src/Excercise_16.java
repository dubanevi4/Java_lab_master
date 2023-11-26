import java.util.Arrays;

public class Excercise_16 {
    public static void main (String[] args){
        int n = 5;
        int[][] a = Solution_16.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_16 {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] a = new int [n][n];
        int count = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = count++;
            }
        }
        return a;
    }
}
