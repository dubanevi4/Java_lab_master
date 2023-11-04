//Given a positive long integer n, containing even quantity of digits in its record.
//Separate number n to the left and right parts with equal quantity of digits.

import java.util.Scanner;

public class Excercise_18 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner (System.in)){
            long num = sc.nextLong();
            int length = 0;
            long left = 0;
            long right = 0;
            for (long i = num; i > 0; i /= 10){
                length++;
            }
            for (int i = length; i > 0; i--){
                if (i > length / 2){
                    right += (num % 10) * Math.pow(10, length - i);
                    num -= num % 10;
                    num /= 10;
                } else {
                    left += (num % 10) * Math.pow(10, length/2 - i);
                    num -= num % 10;
                    num /=10;
                }
            }
            System.out.println(left + " " + right);
        }
    }
}
