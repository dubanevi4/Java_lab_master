import java.util.Arrays;

public class Excercise_3 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8},{0,0,2},{1,-1,-1},{9,1,7}};
        int[][] b = Solution_3.create(a);
        for (int i = 0; i < b.length; i++){
            System.out.println(Arrays.toString(b[i]));
        }
    }
}

class Solution_3 {

    /**
     * @param a m x n matrix, where n > 1
     * @return the m x 2 matrix containing the left and right columns of matrix a
     */
    public static int[][] create(int[][] a) {
        //put your code here
        int[][] b = new int [a.length][2];
        for (int i = 0; i < a.length; i++){
            b[i][0] = a[i][0];
            b[i][1] = a[i][a[i].length-1];
            }
        return b;
    }
}
