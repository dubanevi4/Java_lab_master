import java.util.Arrays;

public class Excercise_10 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8,0},{0,2},{1,-1,-1},{9,1,7,4,5}};
        int[][] b = Solution_10.create(a);
        System.out.println(Arrays.deepToString(b));
    }
}

class Solution_10 {

    /**
     * @param a 2-dimensional array, where the number of elements in each row is greater than 1
     * @return the m x 2 matrix containing the left and right elements
     * of each row of an array a, where m is the number of rows of an array A.
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