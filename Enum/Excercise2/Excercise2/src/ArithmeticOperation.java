enum ArithmeticOperation {
    // TODO: Add your implementation here.
    ADDITION {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },

    MULTIPLICATION {
      @Override
      public double apply (double x, double y){
          return x * y;
        }
    },

    DIVISION {
            @Override
            public double apply (double x, double y){
                if (y == 0) throw new ArithmeticException("Cannot divide by zero.");
                return x / y;
        }
    };

    public abstract double apply(double x, double y);
}

class Demo {

    public static void main(String[] args) {
        for (String arg : args) {
            String[] pair = arg.split(",");
            double a = Double.parseDouble(pair[0]);
            double b = Double.parseDouble(pair[1]);
            String operationName = pair[2];
            // TODO: Add your implementation here.
            ArithmeticOperation op = ArithmeticOperation.valueOf(operationName);
            double result = op.apply(a,b);

            //do not change the next line
            System.out.println(a + ", " + b + ", " + op + ": " + result);
        }
    }
}