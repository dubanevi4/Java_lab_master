package myproject;

import com.codewithmosh.Array;
import com.codewithmosh.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class QueueReverser {

    private Queue<Integer> input;

    //Constructor
    public QueueReverser(Queue<Integer> queue){
        input = queue;
    }

    public void reverse(int k){
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> output = new ArrayDeque<>();
        for (int i = 0; i < k; i++){
            stack.push(input.poll());
        }
        while(!stack.isEmpty()) {
            output.add(stack.pop());
        }
        while(!input.isEmpty()){
            output.add(input.remove());
        }
        input = output;
    }

    @Override
    public String toString(){
        return input.toString();
    }
}

class MainQueueReverser{
    public static void main(String[] args){
        Queue<Integer> inp = new ArrayDeque<>();
        inp.add(10);
        inp.add(20);
        inp.add(30);
        inp.add(40);
        inp.add(50);

        QueueReverser t = new QueueReverser(inp);
        t.reverse(4);
        System.out.println(t);
    }
}
