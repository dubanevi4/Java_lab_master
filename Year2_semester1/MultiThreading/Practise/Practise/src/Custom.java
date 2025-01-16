class Custom extends Thread {
    public Custom(String name) {
        super(name);
    }
    public void run() {
        print(0);
        print(1);
    }
    private synchronized void print(int n) {
        System.out.print(getName() + "-" + n + " ");
    }
}
class SynchroGradedQuest {
    public static void main(String[] args) {
        new Custom("Foo").start();
        new Custom("Bar").start();
    }
}