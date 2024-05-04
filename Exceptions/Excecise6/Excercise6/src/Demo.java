class Demo {

    public static int resistance (int voltage, int current) {
        // TODO: Delete line below and write your own solution.
        if (current == 0){
            throw new ArithmeticException("Resistance is infinite: voltage = " + voltage +", current = " + current);
        }
        return voltage / current;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            String[] pair = arg.split(",");
            int voltage = Integer.parseInt(pair[0]);
            int current = Integer.parseInt(pair[1]);

            // TODO: Delete line below and write your own solution.
            try{
                System.out.println(resistance(voltage, current));
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
    }
}