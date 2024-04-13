class Main {

    static {
        // some hidden verification code inside this block 
    }

    private static void output(UpdateOnCondition instance) {
        if (instance.check()) {
            instance.update();
        }
        System.out.print(instance);
    }

    public static void main(String[] args) {
        java.util.Locale.setDefault(new java.util.Locale("EN"));
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            double x = sc.nextDouble();
            int a = sc.nextInt();
            int b = sc.nextInt();
            output(new Single(x));
            System.out.print(", ");
            output(new Pair(a, b));
        }
    }
}