package com.epam.learn.entity;

public class LearnMainIf {
    public static void main(String[] args) {

    }
    public static double perimeter (double lengthA, double lengthB, String name) {
        double result;
        if (name == null) {
            if (lengthA > 0 && lengthB > 0) {
                result = 2 * (lengthA + lengthB);
            } else {
                result = -1;
            }
        } else {
            throw new IllegalArgumentException("" + name);
        }
        return result;
    }
}
