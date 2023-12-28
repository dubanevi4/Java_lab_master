package com.training.ex1project.packageMainA;
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
        System.out.println(line3.isPerpendicular(line4));
        System.out.println(line0.isPerpendicular(line4));
        //System.out.println(line4.isOver(line5));
        //System.out.println(line1.isOver(line5));
    }


    private static void assertTrue(boolean actual, String description) {
        if (actual) {
            System.out.println("Really, " + description);
            System.exit(-1);
        }
    }
}

