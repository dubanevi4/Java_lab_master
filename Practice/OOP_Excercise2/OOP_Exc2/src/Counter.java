class Counter {
    //add correct modifiers to each field
    private final int DOWN_BOUND = 5;
    private final int UP_BOUND = 10;
    private int state;

    //put 2 constructors here

    public Counter(int state0) {
        if (state0 < DOWN_BOUND){
            this.state = DOWN_BOUND;
        }
        else if (state0 > UP_BOUND) {
            this.state = UP_BOUND;
        } else {
            this.state = state0;
        }
    }

    public Counter() {
        this.state = (DOWN_BOUND+UP_BOUND)/2;
    }

    //put 3 methods here

    public int getState() {
        return state;
    }

    public void inc() {
        if (state < UP_BOUND) {
            this.state ++;
        }
    }

    public void dec() {
        if (state > DOWN_BOUND) {
            this.state --;
        }
    }
}
