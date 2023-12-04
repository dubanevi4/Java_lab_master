import java.util.Arrays;

public class Sorting_Exc4 {
    public static void main(String[] args) {
        char[] letters = {'c','a','b','c','d','e','a'};
        int[] numbers = {25,50,35,25,41,50,90};
        int k = 6;
        Solution_4.sort(letters, numbers);
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(numbers));
    }
}
class Solution_4 {

    /**
     * method sorts two non-empty arrays of equal length parallelly by ascending order
     * (first sort by letters, and if elements of the array letters are equal,
     * then sort by numbers).
     *
     * @param letters the given array
     * @param numbers the given array
     */
    public static void sort(char[] letters, int[] numbers) {
        //put your code here
        int n = letters.length;
        char tempLetter;
        int tempNumber;
        int pos;
        for (int i = 0; i < n; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (letters[j] <= letters[pos]) {
                    pos = j;
                }
            }
            tempLetter = letters[pos];
            tempNumber = numbers[pos];
            letters[pos] = letters[i];
            numbers[pos] = numbers[i];
            letters[i] = tempLetter;
            numbers[i] = tempNumber;
        }
    }
}

