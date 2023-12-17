public class Proc_Prg_Excercise_4 {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(Solution_4.areCoprime(a, b, c));
    }
}
class Solution_4 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return whether they are coprime
     */
    public static boolean areCoprime(int a, int b, int c) {
        //put your code here
        if ((__gcd(a, b) == 1) && (__gcd(a, c) == 1) && (__gcd(b, c) == 1)) {
            return true;
        } else {
            return false;
        }
    }

    private static int __gcd(int a, int b) {
        //put your code here
        // Everything divides 0
        if (a == 0 || b == 0)
            return 0;

        // base case
        if (a == b)
            return a;

        // a is greater
        if (a > b)
            return __gcd(a-b, b);

        return __gcd(a, b-a);
    }
}
