

class Main {
    static {
        //some hidden verification code inside this block 
    }
    public static void main(String[] args) {
        //some hidden code that creates an instance of the Surface type  
        //using an input line and outputs its area.
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String type = sc.next();
            switch (type) {
                case "Floor":
                    Floor floor = new Floor(sc.nextDouble(),sc.nextDouble());
                    System.out.printf("%.3f", floor.area());
                    break;
                case "Tower":
                    Tower tower = new Tower(sc.nextDouble(), sc.nextDouble());
                    System.out.printf("%.3f", tower.area());
                    break;
                case "Sphere":
                    Sphere sphere = new Sphere(sc.nextDouble());
                    System.out.printf("%.3f", sphere.area());
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + type);
            }
        }
    }
}