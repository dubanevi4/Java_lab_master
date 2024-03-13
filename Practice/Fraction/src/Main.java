import java.sql.SQLOutput;
import java.util.Scanner;

class Rational {

    //declare the public class constant
    public final static Rational ZERO = new Rational(0,1);

    //declare the private instance class constants
    private final int p;	//numerator
    private final int q;	//denominator

    //constructor
    public Rational(int p0, int q0) {
        //put your code here

        if (p0 == 0){
            this.p = 0;
            this.q = 1;
        } else {
            int nod = gcd(Math.abs(p0), q0);
            this.p = p0 / nod;
            this.q = q0 / nod;
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    //methods
    public Rational add(Rational r) {
        //put your code here
        return new Rational(this.p * r.q + r.p * this.q,this.q * r.q);
    }

    public Rational sub(Rational r) {
        //put your code here
        return new Rational(this.p * r.q - r.p * this.q,this.q * r.q);
    }

    public Rational mul(Rational r) {
        //put your code here
        return new Rational(this.p * r.p ,this.q * r.q);
    }

    public Rational div(Rational r) {
        //put your code here
        return new Rational(this.p * r.q ,this.q * r.p);
    }

    @Override
    public String toString() {
        //put your code here

        if (q == 1){
            return String.format("%d",p);
        }
        if (Math.abs(p) < q){
            return String.format("%d/%d",p,q);
        }

        return String.format("%d %d/%d",p/q,Math.abs(p%q),q);
    }

}

class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int p1 = sc.nextInt();
            int q1 = sc.nextInt();
            int p2 = sc.nextInt();
            int q2 = sc.nextInt();
            char op = sc.next().charAt(0);
//        System.out.println(new Rational(12,56).div(new Rational(10,28)));
            //put your code here
            Rational r1 = new Rational(p1,q1);
            Rational r2 = new Rational(p2,q2);
            r1 = switch (op) {
                case '+' -> r1.add(r2);
                case '-' -> r1.sub(r2);
                case '*' -> r1.mul(r2);
                case '/' -> r1.div(r2);
                default -> r1;
            };
            System.out.println(r1);
        }
    }
}