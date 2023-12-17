public class Proc_Prg_Excercise_2 {
    public static void main(String[] args) {
        int a = 23;
        int b = 19;
        int c = 17;
        int d = 51;
        System.out.print(Solution2.getResult(a, b, c, d));
    }
}

class Solution2 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @param d the positive number.
     * @return their greatest common divisor
     */
    public static int getResult(int a, int b, int c, int d) {
        //put your code here
        int gcd = euclid(a,euclid(b,euclid(c,d)));
        return gcd;
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
}