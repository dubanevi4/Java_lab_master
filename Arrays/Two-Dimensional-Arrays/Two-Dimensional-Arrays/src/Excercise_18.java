public class Excercise_18 {
    public static void main(String[] args){
        int[][] a = {{2,-1,9},{3,7,-70},{12,-2,-90},{35,100,90}};
        int column = Solution_18.columnOfMax(a);
        System.out.println(column);
    }
}

class Solution_18 {

    /**
     * @param a m x n matrix, n > 0
     *          all elements of the matrix are distinct.
     * @return column which contains the maximum value of the matrix
     */
    public static int columnOfMax(int[][] a) {
        //put your code here
        int column = 0;
        int value = a[0][0];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                if (value < a[i][j]) {
                    value = a[i][j];
                    column = j;
                }
            }
        }
        return column;
    }
}
