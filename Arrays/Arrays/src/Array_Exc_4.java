import java.util.Arrays;

public class Array_Exc_4 {
    public static void main(String[] arg){
        int[] a = {1, 0,-1, 5, 0, 10, 1, 1};
        System.out.println(Arrays.toString(Solution_4.getResult(a)));
    }
}


class Solution_4 {

    /**
     * @param a the given array
     * @return the number of negative, zero, and positive elements in the array a
     */
    public static int[] getResult(int[] a) {
        //put your code here
        int negative = 0;
        int zero = 0;
        int positive = 0;
        for (int element : a){
            if (element > 0 ) {
                positive++;
            }
            else if (element == 0) {
                zero++;
            } else {
                negative++;
            }
        }

        //do not change the next line
        return new int[] {negative, zero, positive};
    }
}
