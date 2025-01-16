import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BarrierNewGraded {
    static CyclicBarrier barrier = new CyclicBarrier(4);
    static int x;
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            try {
                ++x;
                barrier.await();
                System.out.print(x);
            } catch (InterruptedException | BrokenBarrierException ex) {
                ex.printStackTrace();
            }
        });
        ExecutorService s = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            s.submit(th);
        }
        s.shutdown();
    }
}