enum Planet {
    // TODO: Add your implementation here.
    MERCURY(0.39),
    VENUS(0.72),
    EARTH(1.0),
    MARS(1.52),
    JUPITER(5.2),
    SATURN(9.58),
    URANUS(19.18),
    NEPTUNE(30.07);

    private final double DistanceFromSun;

    Planet (double distanceFromSun){
        this.DistanceFromSun = distanceFromSun;
    }

    public double getDistanceFromSun() {
        // TODO: Delete line below and write your own solution.
        return this.DistanceFromSun;
    }

    public static double distanceBetween(Planet p1, Planet p2) {
        // TODO: Delete line below and write your own solution.
        return Math.abs(p1.getDistanceFromSun() - p2.getDistanceFromSun());
    }
}

class Demo {

    public static void main(String[] args) {
        for (String arg : args) {
            String[] pair = arg.split("-");
            String planetNameA = pair[0];
            String planetNameB = pair[1];

            // TODO: Add your implementation here.
            Planet planetA = Planet.valueOf(planetNameA);
            Planet planetB = Planet.valueOf(planetNameB);
            double distanceFromSunToPlanetA = planetA.getDistanceFromSun();
            double distanceFromSunToPlanetB = planetB.getDistanceFromSun();
            double distanceBetween = Planet.distanceBetween(planetA, planetB);

            //do noy change the next line
            System.out.format("%.2f %.2f %.2f%n", distanceFromSunToPlanetA, distanceFromSunToPlanetB, distanceBetween);
        }
    }
}