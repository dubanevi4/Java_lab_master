import java.util.Scanner;

class Main {
    static {
        //some hidden verification code inside this block
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String inputLine = sc.nextLine();
            System.out.println(Solution.getManuscript(inputLine));
        }
    }
}