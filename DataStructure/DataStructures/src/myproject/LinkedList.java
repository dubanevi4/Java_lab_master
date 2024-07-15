package myproject;
public class LinkedList {
    private class Node{
        private int value;
        private Node nextNode;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void addFirst(int value){
        if (this.first == null){
            this.first = new Node(value);
        } else {
            Node tempNode = this.first;
            this.first = new Node(value);
        }
    }
}



public class Main(){
    public static void main(String[] args){
       LinkedList list = new LinkedList();
       list.addFirst(10);
    }
}
