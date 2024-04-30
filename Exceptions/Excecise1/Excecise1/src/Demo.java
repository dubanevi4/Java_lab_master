import com.sun.jdi.IntegerValue;

class Demo {
    public static boolean isPrime(int n) {
        // TODO: Delete line below and write your own solution.
        if (n < 0){
            throw new IllegalArgumentException(n + " is not a natural number");
        }
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO: Delete line below and write your own solution.
        try {
            int arg = Integer.parseInt(args[0]);
            String results = "" + Demo.isPrime(arg);
            System.out.print(results);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}