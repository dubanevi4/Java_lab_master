package Excercise2;

class Main {
    public static void main(String[] args) {
        //some hidden verification code here
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            String line = sc.nextLine();
            String[] parts = line.strip().split(";");
            String carModel = parts[0].strip();
            int carYear = Integer.parseInt(parts[1].strip());
            String engineType = parts[2].strip();
            int engineHorsepower = Integer.parseInt(parts[3].strip());
            Car car = Executor.createCar(carModel, carYear);
            Car.Engine engine = Executor.createEngine(car, engineType, engineHorsepower);
            System.out.println(car.getModel() + ";" + car.getYear() +
                    ";" + engine.getType() + ";" + engine.getHorsepower());
        }
    }
}
