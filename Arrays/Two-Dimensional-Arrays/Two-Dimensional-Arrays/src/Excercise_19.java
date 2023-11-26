public class Excercise_19 {
    public static void main(String[] args){
        int[][] a = {{7,-1,8,0},{0,2},{15,-1,-1},{10},{-9,-1,7,4,-5}};
        int min = Solution_19.minAmongMaxs(a);
        System.out.println(min);
    }
}

class Solution_19 {

    /**
     * @param a a 2-dimensional array, where each row contains at least 1 element
     * @return the minimum value among the maximum values on each row of the array
     */
    public static int minAmongMaxs(int[][] a) {
        //put your code here
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            int maxvalue = a[i][0];
            for (int value : a[i]){
                if (maxvalue < value){
                    maxvalue = value;
                }
            }
            b[i] = maxvalue;
        }
        int minvalue = b[0];
        for ( int value : b){
            if (minvalue > value){
                minvalue = value;
            }
        }
        return minvalue;
    }
}
