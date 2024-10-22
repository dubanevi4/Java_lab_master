package Excercise4;

public class Main {
    public static void main(String[] args){
    //some hidden verification code here
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
        String[] parts = scanner.nextLine().split("/");
        String language = parts[0];
        String greeting =
            switch (language) {
                case "english" -> Factory.englishGreeter().greet(parts[1]);
                case "german" -> Factory.germanGreeter().greet(parts[1]);
                default -> throw new UnsupportedOperationException("Unsupported language " + language);
            };
        System.out.println(greeting);
        }
    }
}
