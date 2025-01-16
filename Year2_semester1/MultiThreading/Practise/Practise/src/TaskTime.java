import java.util.Timer;
import java.util.TimerTask;

class TaskTime extends TimerTask {
    int x;
    public void run() {
        System.out.print(++x);
    }
}
class TimerGuardedQuest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.schedule(new TaskTime(), 25, 50);
        timer.schedule(new TaskTime(), 25, 50);
        Thread.sleep(100);
        timer.cancel();
    }
}