import java.util.Arrays;

public class Excercise_5 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8},{1,-1,-1},{2,-8,5}};
        int[] b = Solution_5.diagonal(a);
        System.out.println(Arrays.toString(b));
    }
}

class Solution_5 {

    /**
     * @param a n x n matrix
     * @return the array from elements located on the main diagonal of the matrix
     */
    public static int[] diagonal(int[][] a) {
        int[] b = new int [a.length];
        for (int i = 0; i < a.length; i++){
           b[i] = a[i][i];
        }
        return b;
    }
}