import java.util.Arrays;

public class Excercise_6 {
    public static void main(String[] args){

        int[][] a = {{7,-1,8},{1,-1,-1},{2,-8,5}};
        //int[][] a = {{1,3},{0,2},{10,5}};
        //int[][] a = {{1}};
        int[] b = Solution_6.straighten(a);
        System.out.println(Arrays.toString(b));
    }
}

class Solution_6 {

    /**
     * @param a m x n matrix
     * @return the array from elements of the matrix in the following order:
     * the row 0 from right to left,
     * the row 1 from left to right,
     * the row 2 from right to left, and so on
     */
    public static int[] straighten(int[][] a) {
        //put your code here
        if (a.length == 1){
            int[] b = a[0];
            return b;
        } else {
            int[] b = new int [a.length * a[0].length];
            int counter = 0;
            for (int i = 0; i < a.length; i++) {
                if (i % 2 != 0) {
                    for (int j = 0; j < a[i].length; j++) {
                        b[counter++] = a[i][j];
                    }
                } else {
                    for (int j = a[i].length-1; j >= 0; j--){
                        b[counter++] = a[i][j];
                    }
                }
            }
            return b;
        }
    }
}