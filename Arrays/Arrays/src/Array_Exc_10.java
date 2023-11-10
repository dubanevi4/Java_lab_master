public class Array_Exc_10 {
    public static void main(String[] args){
        int[] a = {1, -3, 0, 4, 5, 0};
        System.out.println(Solution_10.getResult(a));
    }
}

class Solution_10 {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[2 * n - 1], ..., a[n - 1] + a[n])
     */
    public static int getResult(int[] a) {
        //put your code here
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum = a[i] + a[a.length-1-i];
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}
