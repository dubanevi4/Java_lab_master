import java.util.Arrays;

public class Excercise1 {
    public static void main(String[] args){
    int[] a = {1, 0, 0, 3, 1};
    int[][] b = Solution.create(a);
    for (int i = 0; i <= a.length-1; i++) {
        System.out.println(Arrays.toString(b[i]));
        }
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
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == a[i]) {
                    b[i][j] = 1;
                } else {
                    b[i][j] = 0;
                }
            }
        }
        return b;
    }
}