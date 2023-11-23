public class Array_Exc_10 {
    public static void main(String[] args){
        int[] a = {-100, -10, -5, 0};
        System.out.println(Solution_10.getResult(a));
    }
}

class Solution_10 {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n/2 - 1] + a[n/2])
     */
    public static int getResult(int[] a) {
        //put your code here
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length / 2; i++){
            int sum = a[i] + a[a.length - 1 - i];
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }
}
