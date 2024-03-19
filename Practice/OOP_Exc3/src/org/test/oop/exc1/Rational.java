package org.test.oop.exc1;

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
            return String.format("%d", p);
        }
        if (Math.abs(p) < q){
            return String.format("%d/%d", p, q);
        }
        return String.format("%d %d/%d", p / q, Math.abs(p % q), q);
    }
}
