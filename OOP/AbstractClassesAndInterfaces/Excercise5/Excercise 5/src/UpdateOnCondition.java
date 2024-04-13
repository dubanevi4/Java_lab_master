interface UpdateOnCondition{
    boolean check();
    void update();
}

class Single implements UpdateOnCondition{
    private double x;
    public Single(double x){
        this.x = x;
    }

    @Override
    public boolean check(){
        return this.x < 0;
    }

    @Override
    public void update(){
        this.x = 0.0;
    }

    @Override
    public String toString(){
        return "Single [x=" + this.x + "]";
    }
}

class Pair implements UpdateOnCondition{
    private int a;
    private int b;
    public Pair (int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean check(){
        return a < b;
    }

    @Override
    public void update(){
        int temp;
        temp =this.a;
        this.a = this.b;
        this.b = temp;
    }

    @Override
    public String toString(){
        return "Pair [a=" + this.a + ", " + "b=" + this.b + "]";
    }
}