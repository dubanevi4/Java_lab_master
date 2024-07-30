package myproject;

import java.util.Arrays;

public class Stack {
    private int[] stackArray = new int[5];
    private int count;



    public void push(int value){
        if (count == stackArray.length){
            throw new StackOverflowError();
        }
        stackArray[count++] = value;
    }

    public int pop(){
        if (count == 0){
            throw new IllegalStateException();
        }
        return stackArray[--count];
    }

    public int peak(){
        if (count == 0){
            throw  new IllegalStateException();
        }
        return stackArray[count - 1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    @Override
    public String toString(){
        var content = Arrays.copyOfRange(stackArray,0,count);
        return Arrays.toString(content);
    }
}

class Main2{
    public static void main(String[] args){
        Stack testStack = new Stack();
        testStack.push(10);
        testStack.push(20);
        testStack.push(30);
        testStack.push(40);
        System.out.println(testStack);
        System.out.println(testStack.pop());
        System.out.println(testStack.pop());
        System.out.println(testStack);
        System.out.println(testStack.peak());
        System.out.println(testStack.peak());
        System.out.println(testStack);
        System.out.println(testStack.isEmpty());

    }
}
