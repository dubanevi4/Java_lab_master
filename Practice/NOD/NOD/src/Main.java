import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st digit: ");
            int a = sc.nextInt();

            System.out.print("Enter 2nd digit: ");
            int b = sc.nextInt();

            int nodResult = nod(a, b);

            System.out.printf("Nod for this pair is: %d",nodResult);

            }
        }
    static int nod(int x, int y){
        while (x != 0 && y != 0){
            if (x > y){
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}
