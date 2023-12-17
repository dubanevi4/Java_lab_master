import java.util.Arrays;

public class Proc_Prg_Excercise_1 {
    public static void main(String[] args){
        int x = 36;
        int y = 84;
        System.out.println(Arrays.toString(Solution.getResults(x,y)));
    }
}
class Solution {

    /**
     * @param x the positive number.
     * @param y the positive number.
     * @return their greatest common divisor and the least common multiple
     */
    public static int[] getResults(int x, int y) {
        int gcd = euclid(x, y);
        int lcm = getLcm(x, y, gcd);
        return new int[]{gcd, lcm};
    }

    private static int euclid(int a, int b) {
        //put your code here
        // if b=0, a is the GCD
        if (b == 0)
            return a;

        // call the gcd() method recursively by
        // replacing a with b and b with
        // modulus(a,b) as long as b != 0
        else
            return euclid(b, a % b);
    }

    private static int getLcm(int a, int b, int gcd) {
        //put your code here
        int lcm = Math.abs(a * b)/euclid(a, b);
        return lcm;
    }
}
