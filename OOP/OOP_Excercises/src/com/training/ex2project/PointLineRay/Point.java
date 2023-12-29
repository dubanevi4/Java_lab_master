package com.training.ex2project.PointLineRay;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // returns if this point belongs to the line given by the method argument.
    public boolean isBelonging(Line line){
        return line.ordinate(this.x) == this.y;
    }

    //returns if this point belongs to the ray given by the method argument.
    public boolean isBelonging(Ray ray){
        boolean isOnRayLine = ray.getLine().ordinate(this.x) == this.y;
        boolean isStartOfRay = ray.getX0() == this.x;
        boolean isOnRayLeft = ray.getX0() > this.x && !ray.isToRight();
        boolean isOnRayRight = ray.getX0() < this.x && ray.isToRight();

        return isOnRayLine && (isStartOfRay || isOnRayLeft || isOnRayRight);
    }

    //returns if this point is located over the line given by the method argument.
    public boolean isOver(Line line){
        return line.ordinate(this.x) < this.y;
    }

    @Override
    public boolean equals(Object obj) {
        final double DELTA = 1.0e-9;
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        return Math.abs(x - other.x) < DELTA && Math.abs(y - other.y) < DELTA;
    }
}
