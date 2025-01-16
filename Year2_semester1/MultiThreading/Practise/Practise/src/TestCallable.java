import java.util.concurrent.*;

class TestCallable implements Callable<String> {
    private int workerNumber;
    TestCallable(int workerNumber) {
        this.workerNumber = workerNumber;
    }
    public String call() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Work" + workerNumber + ": " + i);
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        }
        return "Worker " + workerNumber;
    }

    public static void main(String[] args) {
        final int NUM_OF_WORKS = 20;
        ExecutorService pool = Executors.newFixedThreadPool(4);
        TestCallable[] works = new TestCallable[NUM_OF_WORKS];
        Future[] futures = new Future[NUM_OF_WORKS];
        for (int i = 0; i < NUM_OF_WORKS; i++) {
            works[i] = new TestCallable(i + 1);
            futures[i] = pool.submit(works[i]);
        }
        for (int i = 0; i < NUM_OF_WORKS; ++i) {
            try {
                System.out.println(futures[i].get() + " ended");
            } catch (InterruptedException | ExecutionException ex) {
                throw new IllegalStateException();
            }
        }
        pool.shutdown();
    }
}