package Excercise1;

class Main {
    static {
        //some hidden verification code inside this block
    }
    public static void main(String[] args) {
        try (java.util.Scanner scIn = new java.util.Scanner(System.in)) {
            String str = scIn.nextLine();
            try (java.util.Scanner sc = new java.util.Scanner(str)) {
                System.out.println(Solution.getPair(sc));
            }
        }
    }
}