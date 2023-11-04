//Given a positive integer n.
//Output the quantity of four-digit numbers whose sum of digits is equal to n.

import java.util.Scanner;
public class Excercise_17 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int counter = 0;
            int sum;
            for(int a=1000; a<10000; a++){;
                sum = 0;
                for (int result = a; result >= 1; result /= 10){
                    sum += result % 10;
                    }
                    if (sum == n){
                        counter++;
                    }
                }
            System.out.println(counter);
            }
        }
    }
