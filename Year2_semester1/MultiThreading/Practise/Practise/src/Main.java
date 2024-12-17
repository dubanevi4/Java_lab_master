class TalkThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)  {
            System.out.print(this.getName() + ": ");
            System.out.println("Talking " + (i+1));
        }
    }
}

class TalkThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)  {
            System.out.print(this.getName() + ": ");
            System.out.println("Singing " + (i+1));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("main start");
        TalkThread1 talk = new TalkThread1();
        TalkThread2 sing = new TalkThread2();
        talk.start();
        sing.start();
        System.out.println("main ended!");
    }
}