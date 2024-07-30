package myproject;

import java.util.Arrays;

public class ArrayQueue {
    //implement enqueue, dequeue, peak, isEmpty, isFull

    private int[] arr;
    private int count = 0;
    private int front = 0;
    private int rear = 0;

    // Constructor
    public ArrayQueue(int capacity){
        arr = new int[capacity];
    }

    public void enqueue(int el){
        if (isFull()){
            throw new StackOverflowError();
        }
        if (rear == arr.length){
            rear = 0;
        }
        arr[rear++] = el;
        count++;
    }

    public int dequeue(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        if (front == arr.length){
            front = 0;
        }
        int output = arr[front];
        arr[front++] = 0;
        count--;
        return output;
    }

    public int peak(){
        return arr[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == arr.length;
    }

    public String toString(){
        return Arrays.toString(arr);
    }
}

class ArrayQueueMain{
    public static void main(String[] args){
        ArrayQueue arrayqueue = new ArrayQueue(5);
        arrayqueue.enqueue(5);
        arrayqueue.enqueue(10);
        arrayqueue.enqueue(15);
        System.out.println(arrayqueue.dequeue());
        arrayqueue.enqueue(20);
        arrayqueue.enqueue(25);
        System.out.println(arrayqueue.dequeue());
        arrayqueue.enqueue(30);
        arrayqueue.enqueue(35);
        System.out.println(arrayqueue.isEmpty());
        System.out.println(arrayqueue.isFull());
        System.out.println(arrayqueue);
    }
}
