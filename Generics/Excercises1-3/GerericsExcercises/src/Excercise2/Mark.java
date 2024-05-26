package Excercise2;

import java.util.Scanner;

//Declare a generic class Mark with a bounded type parameter T
class Mark<T extends Number>{
    //Declare a class constant PASS_GRADE
    private final static int PASS_GRADE = 4;
    //Declare an instance class constant grade
    private final T grade;
    //Declare a constructor
    public Mark (T grade){
        this.grade = grade;
    }
    //Declare a boolean method isPassed()
    public boolean isPassed(){
        return grade.doubleValue() >= PASS_GRADE;
    }
}

class Solution1 {
    //put the method getMark(Scanner sc) here
    public static Mark<? extends Number> getMark(Scanner sc){
            if (sc.hasNextInt()) {
                return new Mark<Integer>(sc.nextInt());
            } else {
                if (sc.hasNextDouble()) {
                    return new Mark<Double>(sc.nextDouble());
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}