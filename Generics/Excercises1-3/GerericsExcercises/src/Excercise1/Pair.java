package Excercise1;

import java.util.Objects;
import java.util.Scanner;

//Declare a generic class Pair with two type parameters A and B
class Pair<A,B> {
    //declare two private fields: a of the type A and b of the type B
    private A a;
    private B b;

    //declare a coonstructor
    public Pair(A a, B b){
        this.a = a;
        this.b = b;
    }

    //do not change the toString method
    @Override
    public String toString() {
        return "Pair [a=" + a + ", b=" + b + "]";
    }

}

class Solution {
    //put the getPair(Scanner sc) method here
    public static Pair<?,?> getPair(Scanner sc){
        Pair<?,?> pair;
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                pair = new Pair<>(a,b);
            } else {
                String b = sc.next();
                pair = new Pair<>(a,b);
            }
        } else {
            String a = sc.next();
            if (sc.hasNextInt()) {
                int b = sc.nextInt();
                pair = new Pair<>(a,b);
            } else {
                String b = sc.next();
                pair = new Pair<>(a,b);
            }
        }
        return pair;
    }
}