
class Watch {
    private int hours;
    private int minutes;
    private int seconds;

    public Watch(int hours, int minutes, int seconds) {
        //put your code here
        if (hours >= 0 && hours <= 24){
            this.hours = hours % 24;
        }
        if (minutes > 0 && minutes < 60){
            this.minutes = minutes;
        }
        if (seconds > 0 && seconds < 60){
            this.seconds = seconds;
        }
    }

    private Watch() {
        //assign all fields to 0
        //use this() with correct arguments here and in constructors below
        this(0,0,0);
    }

    private Watch(int hours, int minutes) {
        //assign seconds to 0
        //use this() with correct arguments
        this (hours, minutes, 0);
    }

    private Watch(int hours) {
        //assign minutes and seconds to 0
        //use this() with correct arguments
        this (hours, 0, 0);
    }

    //getters and setters
    //put your code here

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours <= 24){
            this.hours = hours % 24;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes <= 60){
            this.minutes = minutes % 60;
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 60){
            this.seconds = seconds % 60;
        } else {
            this.seconds = 0;
        }
    }

    public void update(int hours, int minutes, int seconds) {
        //put your code here
        this.hours = (this.hours + hours + 24) % 24;
        this.minutes = (this.minutes + minutes + 60) % 60;
        this.seconds = (this.seconds + seconds + 60) % 60;
    }

    //do not change the toString() code
    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hours, minutes, seconds);
    }
}
