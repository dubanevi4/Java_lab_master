import java.util.Scanner;

enum DayOfWeek {
    // TODO: Add your implementation here.
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public DayOfWeek next() {
        // TODO: Delete line below and write your own solution.
        // Reminder - take input string from the array args.
        //throw new UnsupportedOperationException("Not implemented yet");
        switch (this){
            case SUNDAY: return MONDAY;
            case MONDAY: return TUESDAY;
            case TUESDAY: return WEDNESDAY;
            case WEDNESDAY: return THURSDAY;
            case THURSDAY: return FRIDAY;
            case FRIDAY: return SATURDAY;
            case SATURDAY: return  SUNDAY;
            default: throw new IllegalArgumentException("Invalid Day");
        }
    }
}

class Demo {

    public static void main(String[] args) {
        try {
            // TODO: Delete line below and write your own solution.
            // Reminder - take input strings from the array args.
            for (String arg : args) {
                DayOfWeek currentDay = DayOfWeek.valueOf(arg.toUpperCase());
                System.out.println(currentDay.next());
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}