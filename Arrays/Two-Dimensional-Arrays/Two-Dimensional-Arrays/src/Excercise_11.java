import java.util.Arrays;

public class Excercise_11 {
    public static void main(String[] args){
        int n = 4;
        int[][] a = Solution_11.create(n);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_11 {

    /**
     * @param n the given positive number
     * @return the square matrix of order n according to the given pattern
     */
    public static int[][] create(int n) {
        //put your code here
        int[][] a = new int [n][n];
        int count = n;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= count-1; j++) {
                a[i][j] = i+1;
            }
            count--;
        }
        return a;
    }
}