package myproject;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public boolean isEmpty() {
        return first == null;
    }

    //getPrevious; complexity O(n)
    public Node getPrevious(Node node){
        var current = first;
        while (current.nextNode != null){
            if (current.nextNode == node){
                return current;
            }
            current = current.nextNode;
        }
        return null;
    }

    public int getSize(){
        return size;
    }

    //addFirst; complexity  O(1)
    public void addFirst(int value) {
        var node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        } else {
            node.nextNode = first;
            first = node;
        }
        size++;
    }

    //addLast; complexity O(1)
    public void addLast(int value) {
        var node = new Node(value);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.nextNode = node;
            last = node;
        }
        size++;
    }

    //deleteFirst; complexity O(1)
    public void deleteFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
        } else {
            var second = first.nextNode;
            first.nextNode = null;
            first = second;
        }
        size--;
    }

    //deleteLast; complexity O(n) because of getPrevious method.
    public void deleteLast(){
        var tempNode = getPrevious(last);
        tempNode.nextNode = null;
        last = tempNode;
        size--;
    }

    //contains; complexity O(n) because of indexOf
    public boolean contains(int value){
        return indexOf(value) != -1;
    }


    //indexOf; complexity O(n)
    public int indexOf(int value){
        var current = first;
        int index = 0;
        while (current != null){
            if (current.value == value){
                return index;
            }
            index++;
            current= current.nextNode;
        }
        return -1;
    }

    //toArray; complexity O(n)
    public int[] toArray(){
       int[] array = new int[size];
       var node = first;
       int index = 0;
        while (node != null){
            array[index++] = node.value;
            node = node.nextNode;
        }
        return array;
    }

    //reverse; complexity O(n)
    public void reverse(){
        if (isEmpty()){
            return;
        }
        var previous = first;
        var current = first.nextNode;
        while(current != null){
            var next = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.nextNode = null;
        first = previous;
    }

    //getKthFromTheEnd(k)
    public int getKthFromTheEnd(int k){
        if (isEmpty()){
            throw new IllegalArgumentException();
        }
        var p1 = first;
        var p2 = first;
        for (int i = 0; i < k - 1; i++){
            p2 = p2.nextNode;
            if (p2 == null){
                throw new IllegalArgumentException();
            }
        }
        while (p2 != last) {
            p1 = p1.nextNode;
            p2 = p2.nextNode;
        }
        return p1.value;
    }

    //printMiddle() complexity O(n)
    public void printMiddle(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        var p1 = first;
        var p2 = first;

        while (p2 != last && p2.nextNode != last){
            p1 = p1.nextNode;
            p2 = p2.nextNode.nextNode;
        }
        if (p2 == last){
            System.out.println(p1.value);
        } else {
            System.out.println(p1.value + ", " + p1.nextNode.value);
        }
    }
}
class Main1 {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.deleteFirst();
        list.deleteLast();
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(40));
        System.out.println(list.getSize());
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));
        list.addLast(50);
        System.out.println(list.getKthFromTheEnd(1));
        list.printMiddle();
    }
}




