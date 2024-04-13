class Main {
    static {
        //some hidden verification code inside this block 
    }
    public static void main(String[] args) {
        //some hidden code that creates an instance of the Sound type  
        //using an input line and outputs its area.
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String type = sc.next();
            switch (type) {
                case "Cat":
                    Pet cat = new Cat();
                    System.out.printf("%s",cat.sound());
                    break;
                case "Dog":
                    Pet dog = new Dog();
                    System.out.printf("%s", dog.sound());
                    break;
                case "Cow":
                    Pet cow = new Cow();
                    System.out.printf("%s", cow.sound());
                    break;
                case "Locomotive":
                    Locomotive locomotive = new Locomotive(sc.nextInt());
                    System.out.printf("%s", locomotive.sound());
                    break;
                case "Surprise":
                    Surprise surprise = new Surprise(sc.nextInt());
                    System.out.printf("%s", surprise.sound());
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + type);
            }
        }
    }
}