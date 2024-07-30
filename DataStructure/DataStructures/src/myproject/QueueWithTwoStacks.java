package myproject;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stackInitial;
    private Stack<Integer> stackReversed;

    //constructor
    public QueueWithTwoStacks(){
        stackInitial = new Stack<>();
        stackReversed = new Stack<>();
    }

    public void enqueue(int el){
        stackInitial.push(el);
    }

    public int dequeue(){
        if (stackInitial.isEmpty()){
            throw new IllegalStateException();
        }
        while (!stackInitial.isEmpty()){
            stackReversed.push(stackInitial.pop());
        }
        int output = stackReversed.pop();
        while (!stackReversed.isEmpty()){
            stackInitial.push(stackReversed.pop());
        }
        return output;
    }

    @Override
    public String toString() {
        return stackInitial.toString();
    }
}

class QueueWithTwoStacksMain{
    public static void main(String[] args){
        QueueWithTwoStacks queue = new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }
}
