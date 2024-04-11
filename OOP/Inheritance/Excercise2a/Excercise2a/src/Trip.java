import java.util.Scanner;

class Trip {
    //declare class and instance constants according to the Java Code Conventions
    private final static int DAILY_RATE = 50;
    private final int numberOfDays;
    private final int fare;

    //declare a parameterized constructor
    public Trip(int numberOfDays, int fare) {
        this.numberOfDays = numberOfDays;
        this.fare = fare;
    }

    public final  int totalCost(){
        return this.totalCostParam(DAILY_RATE);
    }

    //add protected method and use it the totalCost()
    protected int totalCostParam(int dailyRate) {
        //write the correct expression instead of 0
        return dailyRate * numberOfDays + fare;
    }
}


class HomeTrip extends Trip {
    //declare class constant
    private final static int DAILY_RATE = 60;

    //declare a parameterized constructor
    public HomeTrip(int numberOfDays) {
        super(numberOfDays, 0);
    }

    //    override the protected method
    @Override
    protected int totalCostParam(int dailyRate){
        return super.totalCostParam(DAILY_RATE);
    }

}

class OneDayTrip extends Trip {
    //declare class constant
    private final static int DAILY_RATE = 35;

    //declare a parameterized constructor
    public OneDayTrip(int fare) {
        super(1, fare);
    }

    //    override the protected method
    @Override
    protected int totalCostParam(int dailyRate){
        return super.totalCostParam(DAILY_RATE);
    }
}

class Solution {

    public static Trip getTrip(Scanner sc) {
        int id = sc.nextInt();
        //put your code here
        if (id == 1){
            return new HomeTrip(sc.nextInt());
        }
        else if (id == 2){
            return new OneDayTrip(sc.nextInt());
        }
        return new Trip(sc.nextInt(), sc.nextInt());
    }
}