class Main {
    static {
        //some hidden verification code inside this block 
    }
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String type = sc.next();
            String name = sc.next();
            Pet pet;
            switch (type) {
                case "Cat":
                    pet = new Cat(name);
                    break;
                case "Dog":
                    pet = new Dog(name);
                    break;
                case "Cow":
                    pet = new Cow(name);
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + type);
            }
            System.out.printf("%s, I'm %s!", pet.voice(), pet.getName());
        }
    }
}