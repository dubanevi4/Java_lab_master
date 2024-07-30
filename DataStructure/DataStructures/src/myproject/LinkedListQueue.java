package myproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQueue {

    private class Node{
        private int value;
        private Node next;

        public Node(int val){
            value = val;
        }
    }

    private Node head;
    private Node tail;
    private int count = 0;


    //O(1)
    public boolean isEmpty(){
        return count == 0;
    }

    //O(1)
    public int size(){
        return count;
    }

    //O(1)
    public void enqueue(int item){
        var node = new Node(item);

        if (isEmpty()){
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    //O(1)
    public int dequeue(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        Node temp = head;
        head = head.next;
        count--;
        return temp.value;
    }

    //O(1)
    public int peek(){
        return head.value;
    }

    //O(n)
    @Override
    public String toString(){
        List<Integer> arr = new ArrayList<>();
        Node current = head;
        while (current != null){
            arr.add(current.value);
            current = current.next;
        }
        return arr.toString();
    }
}

class MainLinkedListQueue{
    public static void main(String[] args){
        LinkedListQueue l = new LinkedListQueue();
        l.enqueue(10);
        l.enqueue(20);
        l.enqueue(30);
        System.out.println(l);
        System.out.println(l.dequeue());
        l.enqueue(40);
        System.out.println(l.peek());
        System.out.println(l.peek());
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.isEmpty());
    }
}
