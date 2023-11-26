public class Excercise_21 {
    public static void main(String[] args){
        int[][] a = {{10},{-10},{11},{9},{},{5,-99}};
        int twoDigit = Solution_21.numberOfTwoDigits(a);
        System.out.println(twoDigit);
    }
}

class Solution_21 {

    /**
     * @param a a 2-dimensional array
     * @return the number of two-digit numbers in the array
     */
    public static int numberOfTwoDigits(int[][] a) {
        //put your code here
        int twoDigit = 0;
        for (int i = 0; i < a.length; i++){
            for (int value : a[i]){
                if (value > 9 && value < 100 || value < -9 && value > -100){
                    twoDigit++;
                }
            }
        }
        return twoDigit;
    }
}
