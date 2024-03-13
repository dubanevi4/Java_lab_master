class Main {

    static {
        // some hidden verification code below
    }

    private static void output(Pair pair) {
        System.out.printf("a = %d, b = %d\n", pair.getA(), pair.getB());
        System.out.printf("sum = %d, max = %d\n", pair.sum(), pair.max());
    }

    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int a0 = sc.nextInt();
            int b0 = sc.nextInt();
            Pair pair0 = new Pair(a0, b0);
            output(pair0);
            Pair pair1 = new Pair();
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            pair1.setA(a1);
            pair1.setB(b1);
            output(pair1);
        }
    }
}
