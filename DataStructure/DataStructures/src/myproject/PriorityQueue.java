package myproject;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count = 0;

    //Constructor
    public PriorityQueue(int capacity){
        items = new int[capacity];
    }

    public boolean isFull(){
        return count == items.length;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void enqueue(int item){
        if (isFull()){
            throw new IllegalStateException();
        }

        int i = shiftItems(item);
        items[i] = item;
        count++;
    }

    private int shiftItems(int item){
        int i;
        //Shifting items
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return i + 1;
    }

    public int remove(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        return items[--count];
    }

    public String toString(){
        return Arrays.toString(items);
    }
}

class PriorityQueueMain{
    public static void main(String[] args){
        PriorityQueue queue = new PriorityQueue(5);
        System.out.println(queue);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(5);
        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue);
    }
}
