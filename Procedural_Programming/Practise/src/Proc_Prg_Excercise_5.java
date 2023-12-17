public class Proc_Prg_Excercise_5 {
    public static void main(String[] args){
        int[] a = {2,-1,10,16,0,20,15};
        System.out.println(Solution_5.secondLargest(a));
    }
}

class Solution_5 {

    /**
     * @param a the given array, at least 2 distinct numbers
     * @return the second-largest number in the array,
     * i.e. the number that is less than the maximum element of the array,
     * but not less than all other elements, if any.
     */
    public static int secondLargest(int[] a) {
        //put your code here
        int max = a[0];
        int secondMax = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i++){
            if (max < a[i]){
                secondMax = max;
                max = a[i];
            }
            else if (a[i] > secondMax && a[i] != max){
                secondMax = a[i];
            }
        }
        return secondMax;
    }
}
