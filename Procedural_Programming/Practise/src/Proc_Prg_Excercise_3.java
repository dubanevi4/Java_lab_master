public class Proc_Prg_Excercise_3 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(Solution3.getResult(a,b,c));
    }
}

class Solution3 {

    /**
     * @param a the positive number.
     * @param b the positive number.
     * @param c the positive number.
     * @return their least common multiple
     */
    public static int getResult(int a, int b, int c) {
        //put your code here
        return getLcm(a,getLcm(b,c));
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

    public static int getLcm(int a, int b) {
        //put your code here
        int lcm = Math.abs(a * b)/euclid(a, b);
        return lcm;
    }
}



