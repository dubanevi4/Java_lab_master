package myproject;
import com.codewithmosh.ArrayQueue;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Stack;


public class MainQueReverse {
    public static void main(String[] args){
        Queue<Integer> intQue = new ArrayDeque<>();
        intQue.add(10);
        intQue.add(20);
        intQue.add(30);
        reverse(intQue);
        System.out.println(intQue);
    }

    public static void reverse (Queue<Integer> que){
        //add
        //remove
        //isEmpty;
        Stack<Integer> stack = new Stack<>();
        while (!que.isEmpty()){
            stack.push(que.remove());
        }
        while (!stack.isEmpty()){
            que.add(stack.pop());
        }
    }
}

