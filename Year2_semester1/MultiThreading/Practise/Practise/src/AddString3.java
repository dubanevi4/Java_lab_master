import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class AddString3 {
    static Lock lock = new ReentrantLock(false);
    static String str = "";
    static void inc(int value) {
        lock.lock();
        str += value;
        lock.unlock();
        System.out.println(str);
    }
}
class Quest3 {
    public static void main(String[] args) {
        new Thread(() -> AddString3.inc(0)).start();
        new Thread(() -> AddString3.inc(1)).start();
        new Thread(() -> AddString3.inc(2)).start();
    }
}
