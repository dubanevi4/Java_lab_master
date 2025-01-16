import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AddString2 {
    static Lock lock = new ReentrantLock(true);
    static String str = "";
    static void inc(int value) {
        if (lock.tryLock()) {
            str += value;
            lock.unlock();
            System.out.println(str);
        }
    }
}
class Quest2 {
    public static void main(String[] args) {
        new Thread(() -> AddString2.inc(0)).start();
        new Thread(() -> AddString2.inc(1)).start();
        new Thread(() -> AddString2.inc(2)).start();

    }
}