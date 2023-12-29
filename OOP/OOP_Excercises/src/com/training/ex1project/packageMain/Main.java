package com.training.ex1project.packageMain;
import com.training.ex1project.packageLine.Line;

public class Main {
    public static void main(String[] args){
        Line line0 = new Line();
        line0.setB(-5);
        Line line1 = new Line(0, 2);
        Line line2 = new Line();
        line2.setK(1);
        assertTrue(line0.isParallel(line1), "line0 and line1 are parallel");
        assertTrue(!line0.isParallel(line2), "line0 and line2 are not parallel");

        Line line3 = new Line(2, 0);
        Line line4 = new Line(-0.5, 4);
        Line line5 = new Line(-0.5, 1);
        assertTrue(line3.isPerpendicular(line4), "line3 and line4 are perpendicular");
        assertTrue(!line0.isPerpendicular(line4), "line0 and line4 are not perpendicular");
        assertTrue(line4.isOver(line5), "line4 is over line5");
        assertTrue(!line1.isOver(line5), "line1 is not over line5");

        assertTrue(line4.angleOfSlope() == Math.atan(-0.5), "angle of slope of line4 is Math.atan(-0.5)");

        assertTrue(line4.abscissa0() == 8.0, "abscissa of crossing line4 with the X-axis is 8.0");
        assertTrue(Double.isInfinite(line0.abscissa0()), "line0 does not cross the X-axis");
        assertTrue(Double.isNaN(new Line().abscissa0()), "new Line() is the X-axis");

        //hiddenAsserts();		//hidden method to check methods of the Line class

        System.out.println("Passed!");
    }


    private static void assertTrue(boolean actual, String description) {
        if (actual) {
            System.out.println("Really, " + description);
            System.exit(-1);
        }
    }
}

