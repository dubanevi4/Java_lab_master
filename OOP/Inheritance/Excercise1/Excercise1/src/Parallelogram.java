class Parallelogram {
    //declare fields and implement parameterized constructor
    //and two methods for the parallelogram perimeter and area
    private double a;
    private double b;
    private double angle;

    public Parallelogram(double a, double b, double angle){
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public double perimeter(){
        return (this.a + this.b) * 2;
    }

    public double area(){
        return this.a * this.b * Math.sin(this.angle * Math.PI / 180);
    }
}

//add extends in the class header  
class Rectangle extends Parallelogram{
    //no fields and methods
    //implement parameterized constructor with super() statement
    public Rectangle(double a, double b){
        super(a, b, 90);
    }
}

//add extends in the class header  
class Rhombus extends Parallelogram {
    //no fields and methods
    //implement parameterized constructor with super() statement
    public Rhombus(double a,  double angle){
        super(a, a, angle);
    }
}

//add extends in the class header  
class Square extends Rectangle {
    //no fields and methods
    //implement parameterized constructor with super() statement
    public Square(double a){
        super(a,a);
    }
}


class Solution {

    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double alpha = sc.nextDouble();

            //Create an array with 4 elements: parallelogram, rectangle, rhombus, square,
            //and initialize them with input values.
            Parallelogram[] array = {new Parallelogram(a,b,alpha), new Rectangle(a,b), new Rhombus(a, alpha), new Square(a)};

            //Calculate the sums of perimeters and areas of the array elements
            double sumPerimiters = 0;
            double sumAreas = 0;
            for (int i = 0; i < array.length; i++){
                sumPerimiters += array[i].perimeter();
                sumAreas += array[i].area();
            }
            //Output them rounded to 3 decimal places thru a space
            System.out.printf("%.3f %.3f",sumPerimiters, sumAreas);
        }
    }
}