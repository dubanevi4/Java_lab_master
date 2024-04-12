import java.util.Scanner;

//declare the superclass Figure2D1Size
abstract class Figure2D1Size {
    protected final double size;

    public Figure2D1Size(double size) {
        this.size = size;
    }

    public abstract double perimeter();

    public abstract double area();
}


//declare the subclasses Circle and RegularPolygon
class Circle extends Figure2D1Size{

    public Circle (double size){
        super(size);
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * size;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(size, 2);
    }
}

class RegularPolygon extends Figure2D1Size {

    private final int number;

    public RegularPolygon (double size, int number){
        super(size);
        this.number = number;
    }
    @Override
    public double perimeter(){
        return this.size * this.number;
    }

    @Override
    public double area(){
        return 0.25 * Math.pow(this.size, 2) * this.number / Math.tan((Math.PI / this.number));
    }
}


class Solution {
    public static Figure2D1Size createFigure(Scanner sc) {
        //put your code here
        double size = sc.nextDouble();
        if (sc.hasNextInt()){
            int number = sc.nextInt();
            return new RegularPolygon(size, number);
        }
        return new Circle(size);
    }
}


