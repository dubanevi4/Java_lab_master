import java.util.Arrays;

public class Excercise1 {
    public static void main(String[] args){
    int[] a = {1, 0, 0, 3, 1};
    System.out.println(Arrays.toString(Solution.create(a)));
    }
}


class Solution {

    /**
     * @param a the given array, containing numbers from 0 to 3 inclusively
     * @return the k x 4 matrix filled  with zeros and b[i][j] = 1 where j = a[i]
     */
    public static int[][] create(int[] a) {
        //put your code here
        int k = a.length;
        int[][] b = new int[k][4];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < b[i].length; j++) ;
        }
        return b;
    }
}