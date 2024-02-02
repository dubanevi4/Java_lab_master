class Solution {

    /** method returns string with the reversed sequence of characters
     * @param str the given string
     * @return the reversed string
     */
    public static String reverse(String str) {
        //put your code here
        char ch;
        String nstr="";

        for (int i=0; i < str.length(); i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }
}

