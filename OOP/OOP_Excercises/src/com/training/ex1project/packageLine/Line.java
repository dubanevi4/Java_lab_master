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
        return this.k == line.getK();
    }

    //returns if this line is perpendicular to the line given by the method argument.
    public boolean isPerpendicular(Line line){
        return this.k == -1 / line.getK();
    }

    //returns if this line is located over the line given by the method argument.
    public boolean isOver(Line line){
        return this.isParallel(line) && this.b > line.getB();
    }

    //returns an angle of slope of this line in radians (it is equaled to Math.atan(k)).
    public double angleOfSlope(){
        return Math.atan(this.k);
    }

    //returns an abscissa of crossing this line with the X-axis.
    public double abscissa0(){
        return -(this.b / this.k);
    }
}
