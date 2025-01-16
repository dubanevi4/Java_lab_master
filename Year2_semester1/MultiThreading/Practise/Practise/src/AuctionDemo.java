import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class AuctionDemo {
    public static void main(String[] args) {
        int numberParticipant = 5;
        Auction auction = new Auction(numberParticipant);
        int startPrice = 50;
        System.out.println("Start price : " + startPrice);
        for (int num = 0; num < numberParticipant; num++) {
            int cash = 100 + new Random().nextInt(50);
            Participant participant = new Participant(num, startPrice, cash, auction);
            auction.add(participant);
            participant.start();
        }
    }


    public static class Auction {
        private final List<Participant> participants = new ArrayList<>();

        private CyclicBarrier barrier;

        public Auction(int numberParticipant) {
            this.barrier = new CyclicBarrier(numberParticipant, Auction.this::defineWinner);
        }

        public CyclicBarrier getBarrier() {
            return barrier;
        }

        public void add(Participant e) {
            participants.add(e);
        }

        public void defineWinner() {
            Participant winner = Collections.max(participants,
                    Comparator.comparingInt(Participant::getCurrentLotPrice));
            System.out.println("Participant #" + winner.getBidId()
                    + ", price: " + winner.getCurrentLotPrice() + " win!");
            winner.setCash(winner.getCash() - winner.getCurrentLotPrice());
        }
    }

    public static class Participant extends Thread {
        private Integer participantId;
        private int currentLotPrice;
        private int cash;
        private Auction auction;

        public Participant(int id, int currentLotPrice, int cash, Auction auction) {
            this.participantId = id;
            this.currentLotPrice = currentLotPrice;
            this.cash = cash;
            this.auction = auction;
        }

        public Integer getBidId() {
            return participantId;
        }

        public int getCurrentLotPrice() {
            return currentLotPrice;
        }

        public int getCash() {
            return cash;
        }

        public void setCash(int cash) {
            this.cash = cash;
        }

        @Override
        public void run() {
            try {
                System.out.println("Participant #" + participantId + " specifies a price. (cash = " + cash + ")");
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(2500));
                int delta = new Random().nextInt(20);
                currentLotPrice += delta;
                System.out.println("Auction Participant #" + participantId + ": " + currentLotPrice);
                auction.getBarrier().await();
                System.out.println("Participant #" + participantId + " continue to work... (cash = " + cash + ")");
            } catch (BrokenBarrierException | InterruptedException e) {
                throw new IllegalStateException();
            }
        }
    }
}