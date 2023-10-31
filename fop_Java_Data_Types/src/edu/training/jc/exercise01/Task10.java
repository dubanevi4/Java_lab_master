package edu.training.jc.exercise01;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            double dist;
            dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.printf("%.3f", dist);
        }
    }
}
