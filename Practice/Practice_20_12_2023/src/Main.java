import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){

            String line = sc.nextLine();
            String[] lineArray = line.split(" " );
            int[] numArray = new int[lineArray.length];
            for (int i = 0; i < lineArray.length; i++){
                numArray[i] = Integer.parseInt(lineArray[i]);
            }
            System.out.println(Arrays.toString(numArray));
            System.out.println();
        }
    }
}
