import java.util.Arrays;

public class Excercise2 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8},{0,0,2},{1,-1,-1},{9,1,7}};
        int[][] b = Solution_2.create(a);
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(b[1]));
    }
}

class Solution_2 {

    /**
     * @param a m x n matrix, where m > 1
     * @return the 2 x n matrix containing the top and bottom rows of matrix a
     */
    public static int[][] create(int[][] a) {
        //put your code here
        int[][] b = new int [2][a[0].length];
        b[0] = a [0];
        b[1] = a [a.length-1];
        return b;
    }
}
