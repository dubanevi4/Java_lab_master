class Main {
    static {
        //some hidden verification code inside this block 
    }
    public static void main(String[] args) {
        java.util.Locale.setDefault(new java.util.Locale("EN"));
        try (java.util.Scanner scIn = new java.util.Scanner(System.in)) {
            String str = scIn.nextLine();
            try (java.util.Scanner sc = new java.util.Scanner(str)) {
                Figure2D1Size figure = Solution.createFigure(sc);
                System.out.printf("%.3f %.3f", figure.perimeter(), figure.area());
            }
        }
    }
}