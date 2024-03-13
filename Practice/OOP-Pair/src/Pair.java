public class Pair {

    //declare the private instance class integer fields A and B
    private int A;
    private int B;

    //Constructor without arguments, A and B equal to 0 by default
    public Pair() {
        this.A = 0;
        this.B = 0;
    }

    //Parameterized constructor
    public Pair(int a, int b) {
        this.A = a;
        this.B = b;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }

    public void setA(int a) {
        A = a;
    }

    public void setB(int b) {
        B = b;
    }

    public int sum(){
        return (this.A + this.B);
    }

    public int max(){
        if (this.A >= this.B){
            return this.A;
        } else {
            return this.B;
        }
    }
}