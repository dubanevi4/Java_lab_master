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
        int[][] a = new int [n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++){
                if (i <= j){
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
            for (int j = n / 2; j < n; j++){
                if (i >= j - n/2){
                    a[i+n/2][j] = 1;
                } else {
                    a[i+n/2][j] =0;
                }
            }
        }
        for (int i = n / 2; i < n; i++) {
            for (int j = 0; j < n / 2; j++){
                if (i-n/2 <= j){
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
            for (int j = n / 2; j < n; j++){
                if (i >= j){
                    a[i][j] = 1;
                } else {
                    a[i/2][j] =0;
                }
            }
        }
        return a;
    }
}
