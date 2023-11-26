import java.util.Arrays;

public class Excercise_20 {
    public static void main(String[] args){
        int[][] a = {{2,5,3,5,5,5,9,5,0},{1,3,5},{5,-5,5},{},{0},{5},{5,5,5}};
        boolean[] b = Solution_20.create(a);
        System.out.println(Arrays.toString(b));
    }
}

class Solution_20 {

    /**
     * @param a a 2-dimensional array
     * @return the boolean array b, where b[i] is true
     * if the number 5 occurs at least three times in the row i
     */
    public static boolean[] create(int[][] a) {
        //put your code here
        boolean[] b = new boolean[a.length];
        for (int i = 0; i < a.length; i++){
            int count = 0;
            for (int value : a[i]){
                if (value == 5){
                    count++;
                }
            }
            if (count >= 3){
                b[i] = true;
            }
        }
        return b;
    }
}
