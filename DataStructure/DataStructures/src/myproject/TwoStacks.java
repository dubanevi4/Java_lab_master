package myproject;

import java.util.Arrays;

public class TwoStacks {
    int[] arr;
    int size;
    int top1;
    int top2;

    //Constructor;
    TwoStacks(int n){
        size = n;
        arr = new int[n];
        top1 = 0;
        top2 = n - 1;
    }

    void push1(int val){
        if (top1 == top2){
            throw new StackOverflowError();
        }
        arr[top1] = val;
        top1++;
    }

    void push2(int val){
        if (top2 == top1 ){
            throw new StackOverflowError();

        }
        arr[top2] = val;
        top2--;
    }

    int pop1(){
        return arr[++top1];
    }

    int pop2(){
        return arr[--top2];
    }

    int peak1(){
        int ind = top1;
        ind++;
        return arr[ind];
    }

    int peak2(){
        int ind = top2;
        ind--;
        return arr[ind];
    }

    boolean isEmpty1(){
        return top1 == 0;
    }

    boolean isEmpty2(){
        return top2 == size - 1;
    }

    boolean isFull1(){
        return !isEmpty1() && top1 + 1 == top2;
    }

    boolean isFull2(){
        return !isEmpty2() && top2 - 1 == top1;
    }

    @Override
    public String toString(){
        return Arrays.toString(arr);
    }
}

class Main2Stack{
    public static void main(String[] args) {
        TwoStacks stack = new TwoStacks(10);
        System.out.println(stack);
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        stack.push1(4);
        stack.push2(5);
        stack.push2(6);
        stack.push2(7);
        stack.push1(8);
        stack.push1(9);
        stack.push1(10);
        System.out.println(stack);
        System.out.println(stack.isFull1());
        System.out.println(stack.isFull2());
    }
}
