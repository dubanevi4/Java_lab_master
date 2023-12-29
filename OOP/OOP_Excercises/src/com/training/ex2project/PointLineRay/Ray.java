package com.training.ex2project.PointLineRay;

public class Ray {
    private double x0;
    private Line line ;
    private boolean toRight;

    public Ray(double x0, Line line, boolean toRight) {
        this.x0 = x0;
        this.line = line;
        this.toRight = toRight;
    }

    public double getX0() {
        return x0;
    }

    public Line getLine() {
        return line;
    }

    public boolean isToRight() {
        return toRight;
    }

    public Point getOrigin(){
        return new Point(x0,line.ordinate(this.x0));
    }
}
