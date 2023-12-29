package com.training.ex2project.PointLineRay;

public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    // returns an ordinate of this line on the given abscissa x.
    public double ordinate(double x){
        return k * x + b;
    }

    // returns a point of intersection this line and the line given by the method argument.
    // If these lines are parallel or coincident, then return the null value.
    public Point intersection(Line line){
        if (this.k == line.k){
            return null;
        }

        double xIntersection = (line.b - this.b) / (this.k - line.k);
        double yIntersection = this.ordinate(xIntersection);

        return new Point(xIntersection, yIntersection);
    }

    // returns a point of intersection this line and the ray given by the method argument.
    // If they do not have a single point of intersection, then return the null value.
    public Point intersection(Ray ray){
        if (ray.getOrigin().isOver(this) && ray.isToRight()){
            return null;
        }

        return this.intersection(ray.getLine());
    }
}
