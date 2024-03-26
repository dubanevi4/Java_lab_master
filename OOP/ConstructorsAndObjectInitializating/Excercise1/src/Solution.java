import java.util.Scanner;

class Pair {
    //fields must be the private instance constants
    private final int a;
    private final int b;

    //declare and implement the private parameterized constructor
    private Pair(int a0, int b0){
        this.a = a0;
        this.b = b0;
    }

    //add modifiers to methods and implement them
    public static Pair newInstance(int a, int b) {
        //put your code here
        return new Pair(a, b);
    }

    public Pair orderedCopy() {
        //put your code here
        if (this.a <= this.b){
            return new Pair(this.a, this.b);
        } else {
            return new Pair(this.b, this.a);
        }
    }

    Pair swappedCopy() {
        //put your code here
        return new Pair(this.b,this.a);
    }

    //do not change the toString() code
    @Override
    public String toString() {
        return String.format("%d;%d", a, b);
    }

}

class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a0 = sc.nextInt();
            int b0 = sc.nextInt();
            //put your code here
            Pair ab = Pair.newInstance(a0,b0);
            System.out.printf("%s %s %s",ab,ab.orderedCopy(),ab.swappedCopy());
        }
    }
}