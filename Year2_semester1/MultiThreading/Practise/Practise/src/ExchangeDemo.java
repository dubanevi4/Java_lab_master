import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class ExchangeDemo {
    public static void main(String[] args) {
        ItemAction action = new ItemAction();
        Item o1 = new Item(101, 5.0, "Tie");
        Item o2 = new Item(171, 7.0, "Gloves");
        System.out.println(o1 + "\n" + o2);
        new Thread(() -> action.doActionPrice(o1, 0.9f)).start();
        new Thread(() -> action.doActionDescription(o2, " with discount")).start();
        try {
            TimeUnit.SECONDS.timedJoin(Thread.currentThread(), 1);
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
        System.out.println(o1 + "\n" + o2);
    }

    public static class ItemAction {
        private Exchanger<Item> exchanger = new Exchanger<>();
        public void doActionPrice(Item item, float discount) {
            try {
                item.setPrice(item.getPrice() * discount);
                item = exchanger.exchange(item);
                item.setPrice(item.getPrice() * discount);
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        }
        public void doActionDescription(Item item, String addDescription) {
            try {
                item.setDescription(item.getDescription() + addDescription);
                item = exchanger.exchange(item);
                item.setDescription(item.getDescription() + addDescription);
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
        }
    }

    public static class Item {
        private int itemId;
        private double price;
        private String description;
        public Item(int itemId, double price, String description) {
            this.itemId = itemId;
            this.price = price;
            this.description = description;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        @Override
        public String toString() {
            return String.format("id=%d, price=%4.2f, description=%s", itemId, price, description);
        }
    }
}