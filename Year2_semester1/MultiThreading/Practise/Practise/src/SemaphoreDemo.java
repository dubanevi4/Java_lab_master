import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static final int ITEMS_COUNT = 10;
    public final static Semaphore sortSemaphore = new Semaphore(0, true);
    public static void main(String[] args) {
        int[] items = new int[ITEMS_COUNT];
        for (int i = 0; i < items.length; i++) {
            items[i] = (int) (Math.random()*10);
        }
        System.out.println("Initial array: " + Arrays.toString(items));
        new Thread(new ArraySort(items)).start();
        for (int i = 0; i < items.length; i++) {
            sortSemaphore.acquireUninterruptibly();
            System.out.println("Step [" + (i + 1) + "]: " + Arrays.toString(items));
        }
        System.out.println("Sorted array: " + Arrays.toString(items));
    }
}
class ArraySort implements Runnable {
    private int[] items;
    public ArraySort(int[] items) {
        this.items = items;
    }
    public void run() {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] < items[j]) {
                    int tmp = items[i];
                    items[i] = items[j];
                    items[j] = tmp;
                }
            }
            SemaphoreDemo.sortSemaphore.release();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        }
        SemaphoreDemo.sortSemaphore.release();
    }
}
