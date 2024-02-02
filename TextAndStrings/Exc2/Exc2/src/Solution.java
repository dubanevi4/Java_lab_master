class Solution {

    /** returns the number of digits in a string
     * @param str the given string
     * @return the number of digits in a string
     */
    public static int countDigitsInString(String str) {
        //put your code here
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                count++;
            }
        }
        return count;
    }
}