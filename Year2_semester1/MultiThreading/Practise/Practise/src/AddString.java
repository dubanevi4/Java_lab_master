import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

class AddString {
    static Lock lock = new ReentrantLock(false);
    static String res;
    void inc(int value) {
        if (lock.tryLock()) {
            res += value;
            lock.unlock();
        }
    }
}
class Quest {
    public static void main(String[] args) {
        IntStream.range(0, 3).forEach(n -> new AddString().inc(n));
        System.out.print(AddString.res);
    }
}