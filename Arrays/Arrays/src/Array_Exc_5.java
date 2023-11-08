import java.util.Arrays;
public class Array_Exc_5 {
    public static void main(String[] args){
        int[] a = {2, 4, -1, 0, -5};
        System.out.println(Arrays.toString(Solution_5.swapMinAndMax(a)));
    }
}
class Solution_5 {

    /**
     * method swaps the largest and smallest elements of array a
     *
     * @param a the given array, all its elements are distinct
     */
    public static int[] swapMinAndMax(int[] a) {
        //put your code here
        int minIdx = 0;
        int maxIdx = 0;
        int smallestNum = a[0];
        int largestNum = a[0];
        int idxSmall = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < smallestNum) {
                 smallestNum = a[i];
                 minIdx = i;

            }
            else if (a[i] > largestNum){
                largestNum = a[i];
                maxIdx = i;
            }
        }
        a[maxIdx] = smallestNum;
        a[minIdx] = largestNum;
        return a;
    }
}
