class Solution {
    /**
     * generates a sequence of numbers
     *
     * @param start initial value of the number
     * @param count number of numbers in sequence
     * @return generated sequence of numbers
     */
    public static String generateNumberSequence(int start, int count) {
        //put your code here

        if (count == 0){
            StringBuilder sb = new StringBuilder("()");
            return sb.toString();
        }
        if (count > 0) {
            int end = start + count - 1;
            StringBuilder sb = new StringBuilder("(");
            for (int i = start; i <= end; i++) {
                if (i < end) {
                    sb.append(i + " ");
                } else if (i == end) {
                    sb.append(i + ")");
                }
            }
            return sb.toString();
        }
        return "()";
        }
    }