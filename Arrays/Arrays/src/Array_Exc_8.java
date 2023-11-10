public class Array_Exc_8 {
    public static void main(String[] args){
        int[] a = {-1, 9};
        System.out.println(Solution_8.getResult(a));
    }
}

class Solution_8 {

    /**
     * @param a the given array, a.length >= 2
     * @return k1 + k2,
     * where k1 is maximum of elements of the array a with even indices,
     * and k2 is minimum of elements of the array a with odd indices.
     */
    public static int getResult(int[] a) {
        //put your code here
        int minIdx = 1;
        int maxIdx = 0;
        int max = a[0];
        int min = a[1];
        for (int i = 0 ; i < a.length; i++){
            if (i % 2 == 0){
                if (max < a[i]){
                    max = a[i];
                }
            } else {
                if (min > a[i]){
                    min = a[i];
                }
            }
        }
        return min+max;
    }
}