import java.util.Arrays;

public class Excercise_17 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8,0},{0,2},{1,-1,-1},{},{-9,-1,7,4,-5}};
        int[] b = Solution_17.sumsOfNegatives(a);
        System.out.println(Arrays.toString(b));
    }
}

class Solution_17 {

    /**
     * @param a a 2-dimensional array
     * @return the array from sums of negative elements in each row
     */
    public static int[] sumsOfNegatives(int[][] a) {
        //put your code here
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int sum = 0;
            for (int value : a[i]){
                if (value <= 0){
                    sum += value;
                }
            }
            b[i] = sum;
        }
        return b;
    }
}
