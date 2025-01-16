import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomPoolThread {
    public static void main(String[] args) {
        Thread t = new DealThread();
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(t);
        service.submit(t);
        service.shutdown();
    }
}

class DealThread extends Thread {
    int i = 1;
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print(i);
        }
    }
}