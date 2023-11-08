
public class Array_Exc_2 {
    public static void main(String[] args){
        int[] a = {1, 4, 5, 6, 2, -3, 9};
        int k = 3;
        System.out.print(Solution2.getResult(a,k));
    }
}

class Solution2 {

    /**
     * @param a the given array
     * @param k > 0 the given number
     * @return the sum of those elements of the array a that are multiples of the k
     */
    public static int getResult(int[] a, int k) {
        //put your code here
        int sum = 0;
        for (int value: a){
            if (value % k == 0){
                sum += value;
            }
        }
        return sum;
    }
}
