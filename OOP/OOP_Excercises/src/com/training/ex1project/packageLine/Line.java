package com.training.ex1project.packageLine;

public class Line {

    //create 2 fields, 2 constructors, and 9 methods
    private double k;
    private double b;

    public Line() {
    }

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public void setK(double k) {
        this.k = k;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getK() {
        return k;
    }

    public double getB() {
        return b;
    }

    //returns if this line is parallel to the line given by the method argument.
    public boolean isParallel(Line line) {
        double x1 = 0;
        double x2 = 10;
        double y1 = this.k * x1 + this.b;
        double y2 = this.k * x2 + this.b;
        double y3 = line.getK()*x1 + line.getB();
        double y4 = line.getK()*x2 + line.getB();
        if (y1 - y3 == y2 - y4){
            return true;
        } else {
            return false;
        }
    }

    //returns if this line is perpendicular to the line given by the method argument.
    public boolean isPerpendicular(Line line){
        double x1 = 0;
        double x2 = 10;
        double y1 = this.k * x1 + this.b;
        double y2 = this.k * x2 + this.b;
        double y3 = line.getK()*x1 + line.getB();
        double y4 = line.getK()*x2 + line.getB();

        double m1 = (y2 - y1) / (x2 - x1);
        double m2 = (y4 - y3) / (x2 - x1);

        if (m1 * m2 == -1){
            return true;
        } else {
            return false;
        }
    }

    //returns if this line is located over the line given by the method argument.
//    public boolean isOver(Line line){
//        double x1 = 0;
//        double x2 = 10;
//        double y1 = this.k * x1 + this.b;
//        double y2 = this.k * x2 + this.b;
//        double y3 = line.getK()*x1 + line.getB();
//        double y4 = line.getK()*x2 + line.getB();
//
//
//    }
//
//    //returns an angle of slope of this line in radians (it is equaled to Math.atan(k)).
//    public angleOfSlope(){
//
//    }
//
//    //returns an abscissa of crossing this line with the X-axis.
//    public abscissa0(){
//
//    }
}
