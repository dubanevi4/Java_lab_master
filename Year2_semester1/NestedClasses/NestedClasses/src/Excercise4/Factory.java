package Excercise4;

class Factory {
    static Greeter englishGreeter() {
        // TODO write your code here
        return new Greeter() {
            @Override
            String greet(String name) {
                return "Good Afternoon " + name + "!";
            }
        };
    }

    static Greeter germanGreeter() {
        // TODO write your code here
        return new Greeter() {
            @Override
            String greet(String name) {
                return "Guten tag " + name + "!";
            }
        };
    }
}

abstract class Greeter {
    // TODO write your code here
    abstract String greet(String name);
}
