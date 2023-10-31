package edu.training.jc.exercise01;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            int digit1 = number % 10;
            number /= 10;
            int digit2 = number % 10;
            number /= 10;
            int digit3 = number % 10;
            number /= 10;
            int prod = digit1 * digit2 * digit3 * number;
            System.out.println(prod);
        }
    }
}
