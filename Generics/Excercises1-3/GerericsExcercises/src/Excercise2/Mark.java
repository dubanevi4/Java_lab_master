package Excercise2;

import java.util.Scanner;

//Declare a generic class Mark with a bounded type parameter T
class Mark<T>{
    //Declare a class constant PASS_GRADE
    private final int PASS_GRADE = 4;
    //Declare an instance class constant grade
    private final T grade;
    //Declare a constructor
    public Mark (T grade){
        this.grade = grade;
    }
    //Declare a boolean method isPassed()
    public boolean isPassed(){
        return (Integer)this.grade > PASS_GRADE;
    }
}

class Solution1 {
    //put the method getMark(Scanner sc) here
    public static boolean getMark(Scanner sc){

    }

}