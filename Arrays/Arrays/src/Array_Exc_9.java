public class Array_Exc_9 {
    public static void main(String[] args){
        int c = 0;
        int d = 10;
        int[] a = {3, -1, 10, 10, 0, 15, 20};
        System.out.println(Solution_9.getResult(a,c,d));
    }
}

class Solution_9 {

    /**
     * @param a the given array
     * @param c the given number
     * @param d the given number
     * @return the number of elements of the array a that belong to the segment [?, d]
     */
    public static int getResult(int[] a, int c, int d) {
        //put your code here
        int count = 0;
        for (int element : a){
            if (element >= c && element <= d){
                count++;
            }
        }
        return count;
    }
}