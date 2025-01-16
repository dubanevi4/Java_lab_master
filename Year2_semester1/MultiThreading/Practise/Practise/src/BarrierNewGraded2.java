import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BarrierNewGraded2 {
    static CyclicBarrier barrier = new CyclicBarrier(2);
    public static void main(String[] args) {
        int x[] = new int[2];
        Thread th = new Thread(() -> {
            try {
                x[0] = x[1]++;
                barrier.await();
                System.out.print(x[0] + " " + x[1] + " ");
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