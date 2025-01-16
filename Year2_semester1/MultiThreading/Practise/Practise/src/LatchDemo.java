import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class LatchDemo {
    public static void main(String[] args) {
        int numbersParticipant = 5;
        AuctionLatch auction = new AuctionLatch(numbersParticipant);
        int startPrice = 110;
        auction.start();
        for (int num = 0; num < numbersParticipant; num++) {
            int cash = 100 + new Random().nextInt(20);
            ParticipantLatch participant = new ParticipantLatch(num, startPrice, cash, auction);
            auction.add(participant);
            participant.start();
        }
    }

    public static class AuctionLatch extends Thread {
        private List<ParticipantLatch> participants = new ArrayList<>();
        private static CountDownLatch latchEndAuction = new CountDownLatch(1);
        private static CountDownLatch latchAuctionBegin;
        public AuctionLatch(int numbersParticipant) {
            latchAuctionBegin = new CountDownLatch(numbersParticipant);
        }
        public void add(ParticipantLatch e) {
            participants.add(e);
        }
        public CountDownLatch getLatchEndAuction() {
            return latchEndAuction;
        }
        public CountDownLatch getLatchAuctionBegin() {
            return latchAuctionBegin;
        }
        @Override
        public void run() {
            try {
                System.out.println("Waiting for participants to bet...");
                latchAuctionBegin.await();
            } catch (InterruptedException e) {
                throw new IllegalStateException();
            }
            defineWinner();
            latchEndAuction.countDown();
        }
        private void defineWinner() {
            ParticipantLatch winner = Collections.max(participants
                    .stream()
                    .filter(o -> !o.isLost())
                    .collect(Collectors.toList()), Comparator.comparingInt(ParticipantLatch::getCurrentLotPrice));
            System.out.println("Participant #" + winner.getParticipantId()
                    + ", price: " + winner.getCurrentLotPrice() + " win!");
            winner.setCash(winner.getCash() - winner.getCurrentLotPrice());
        }
    }

    public static class ParticipantLatch extends Thread {
        private Integer participantId;
        private int currentLotPrice;
        private int cash;
        private AuctionLatch auctionLatch;
        private CountDownLatch latchEndBid = AuctionLatch.latchEndAuction;
        private CountDownLatch latchAuctionBegin = AuctionLatch.latchAuctionBegin;
        private boolean lost;
        public ParticipantLatch(int id, int lotPrice, int cash, AuctionLatch auctionLatch) {
            this.participantId = id;
            this.currentLotPrice = lotPrice;
            this.cash = cash;
            this.auctionLatch = auctionLatch;
        }
        public Integer getParticipantId() {
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
        public boolean isLost() {
            return lost;
        }
        @Override
        public void run() {
            try {
                if(cash < currentLotPrice) {
                    lost = true;
                    auctionLatch.getLatchAuctionBegin().countDown();
                    System.out.println("Participant #" + participantId + " lost because (cash = " + cash + ") < (price = "
                            + currentLotPrice + ")");
                    return;
                }
                System.out.println("Participant #" + participantId + " specifies a price. (cash = " + cash + ")");
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(2500));
                int delta = new Random().nextInt(10);
                currentLotPrice += delta;
                currentLotPrice = currentLotPrice < cash ? currentLotPrice : cash;
                System.out.println("Made a bet Participant #" + participantId + ": " + currentLotPrice);
                auctionLatch.getLatchAuctionBegin().countDown();
                auctionLatch.getLatchEndAuction().await();
            } catch(InterruptedException e) {
                throw new IllegalStateException();
            }
            System.out.println("Participant #" + participantId + " continue to work... (cash = " + cash + ") ");
        }
    }
}
