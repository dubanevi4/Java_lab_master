import java.util.Arrays;

public class Excercise_23 {
    public static void main(String[] args){
        int[][] a = {{2,3,45},{9,4,5},{4,3,0},{-1,9,2}};
        Solution_23.sortedByInitial(a);
        System.out.println(Arrays.deepToString(a));
    }
}

class Solution_23 {

    /**
     * sorts the matrix by ascending of the initial element of each row
     * @param a m x n matrix, initial elements of each row are distinct
     */
    public static void sortedByInitial(int[][] a) {
        //put your code here
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j][0] < a[minIdx][0]) {
                    minIdx = j;
                }
            }
            int[] temp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = temp;
        }
    }
}
