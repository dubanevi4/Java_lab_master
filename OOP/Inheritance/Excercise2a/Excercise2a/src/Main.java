import java.util.Scanner;

class Main {
    static {
        //some hidden verification code inside this block
    }
    public static void main(String[] args) {
        try (Scanner scIn = new Scanner(System.in)) {
            String str = scIn.nextLine();
            try (Scanner sc = new Scanner(str)) {
                int sum = 0;
                while (sc.hasNextInt()) {
                    sum += Solution.getTrip(sc).totalCost();
                }
                System.out.println(sum);
            }
        }
    }
}