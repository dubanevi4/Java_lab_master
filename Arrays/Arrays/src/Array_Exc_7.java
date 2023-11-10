public class Array_Exc_7 {
    public static void main(String[] args){
        int[] a = {3, 5};
        System.out.println(Solution_7.getResult(a));
    }
}


class Solution_7 {

    /**
     * @param a the given array, a.length <= 30
     * @return the sum of elements of the array a whose indices are prime numbers
     */
    public static int getResult(int[] a) {
        //put your code here
        int sum = 0;
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        if (a.length > 2){
            for (int number: primeNumbers){
                if (number <= a.length) {
                    sum += a[number];
                }
            }
        }
        return sum;
    }
}