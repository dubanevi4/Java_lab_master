import java.util.Arrays;

public class Sorting_Exc4_temp {
    public static void main(String[] args) {
        char[] letters = {'a','a','a'};
        int[] numbers = {3,2,1};
        Solution_4_temp.sort(letters, numbers);
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(numbers));
    }
}
class Solution_4_temp {

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
                if (letters[j] < letters[pos]) {
                    pos = j;
                }
                else if (letters[j] == letters[pos]) {
                    if (numbers[j] < numbers[pos]) {
                        pos = j;
                    }
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