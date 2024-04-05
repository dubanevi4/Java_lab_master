class Pair {
    //declare instance constants
    private final int a;
    private final int b;
    //declare a parameterized constructor
    public Pair(int a, int b){
        this.a = a;
        this.b = b;
    }

    //override the method equals(Object obj)

    public boolean equals(Pair second){
        return (this.a == second.a && this.b == second.b) || (this.b == second.a && this.a == second.b);
    }
}

class ColoredPair extends Pair {
    //declare an instance constant
    private final String color;

    //declare a parameterized constructor
    public ColoredPair(int a, int b, String color){
    super(a, b);
    this.color = color;
    }
}