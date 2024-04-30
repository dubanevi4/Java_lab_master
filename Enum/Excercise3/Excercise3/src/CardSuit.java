enum CardSuit {
    // TODO: Add your implementation here.
    HEARTS, DIAMONDS, CLUBS, SPADES;

    @Override
    public String toString() {
        String name = name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}

class Demo {

    public static void main(String[] args) {
        // Reminder - take input strings from the array args.
        // TODO: Delete line below and write your own solution.
        for (String arg : args) {
            System.out.println(CardSuit.valueOf(arg));
        }
    }
}