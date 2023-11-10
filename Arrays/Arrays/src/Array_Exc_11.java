public class Array_Exc_11 {
    public static void main(String[] args){
        int[] a = {3, 2, 1, 2, 1, 1, 5, 10};
        System.out.println(Solution_11.getResult(a));
    }
}

class Solution_11 {

    /**
     * @param a the given array
     * @return the number of elements of the array a
     * that are greater than the minimum element of the array a
     */
    public static int getResult(int[] a) {
        //put your code here
        int count = 0;
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] < min) {
                min = a[i];
                count = i;
            }else if (a[i] != min) {
                count++;
            }
        }
        return count;
    }
}
