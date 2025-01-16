import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BarrierNewGraded3 {
    static int y;
    static CyclicBarrier barrier = new CyclicBarrier(2);
    public static void main(String[] args) {
        int x = ++y;
        Thread th = new Thread(() -> {
            try {
                y++;
                barrier.await();
                System.out.print(x + " " + y + " ");
            } catch (InterruptedException | BrokenBarrierException ex) {
                ex.printStackTrace();
            }
        });
        ExecutorService s = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 2; i++) {
            s.submit(th);
        }
        s.shutdown();
    }
}