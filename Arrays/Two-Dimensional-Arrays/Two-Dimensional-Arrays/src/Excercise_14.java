import java.util.Arrays;

public class Excercise_14 {
    public static void main (String[] args){
        int n = 5;
        int[][] a = Solution_14.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_14 {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] a = new int [n][n];
        int count = n;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                a[i][j] = count++;
            }
            count = n-i-1;
        }
        return a;
    }
}
