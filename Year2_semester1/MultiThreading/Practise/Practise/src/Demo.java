import java.util.concurrent.*;

public class Demo {
    public static void main(String[] args) throws Exception{
        ConcurrentHashMap<Integer, String> hashMap = new ConcurrentHashMap<>();
        ExecutorService service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() ->  hashMap.put(1, "C"));
            service.execute(() ->  hashMap.put(2, "D"));
            service.execute(() ->  hashMap.put(2, "E"));
        } finally {
            service.shutdown();
        }
        hashMap.putIfAbsent(2, "C");
        hashMap.remove(1);
        hashMap.putIfAbsent(1, "D");
        hashMap.replace(1, "D", "A");
        System.out.println(hashMap);
    }
}
