import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        System.out.println((Solution.calculateAverage(10,3)));

    }

    class Solution {

        /**
         * calculates the average value of two Integers
         *
         * @param number1 the first value of the Integer type
         * @param number2 the second value of the Integer type
         * @return the average value of the type Double, or null otherwise
         */
        public static Double calculateAverage(Integer number1, Integer number2) {
            //put your code here
            try {
                return ((double) number1 + number2) / 2;
            } catch (NullPointerException e) {
                return null;

            }
        }
    }
}