package org.test.oop.exc1;

import java.util.Scanner;

class Solution {
    public static void main(String[] arguments) {
        try (Scanner sc = new Scanner(System.in)) {

            int p1 = sc.nextInt();
            int q1 = sc.nextInt();
            int p2 = sc.nextInt();
            int q2 = sc.nextInt();
            char op = sc.next().charAt(0);


            //put your code here
            Rational r1 = new Rational(p1, q1);
            Rational r2 = new Rational(p2, q2);
            Rational r3 = new Rational(0,1);
            switch(op) {
                case '+':
                    r3 = r1.add(r2);
                    break;
                case '-':
                    r3 = r1.sub(r2);
                    break;
                case '*':
                    r3 = r1.mul(r2);
                    break;
                case '/':
                    r3 = r1.div(r2);
                    break;
                default:
                    break;
            }
            System.out.println(r3);
        }
    }
}