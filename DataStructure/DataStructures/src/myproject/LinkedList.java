package myproject;
public class LinkedList {
    private class Node {
        private int value;
        private Node nextNode;

        public Node(int value) {
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node) {
            nextNode = node;
        }
    }

    private Node first;
    private Node last;
    private int size = 0;

    public boolean isEmpty() {
        return first == null;
    }

    //getPrevioud for deleting last node O(n)
    public Node getPrevious(Node node){
        var tempNode = first;
        for (int i = 0; i < size; i++){
            tempNode = tempNode.nextNode;
            if (tempNode.nextNode == node){
                return tempNode;
            }
        }
        return null;
    }

    //addFirst O(1)
    public void addFirst(int value) {
        if (isEmpty()) {
            first = last = new Node(value);
            size++;
        } else {
            var tempNode = first;
            first = new Node(value);
            first.nextNode = tempNode;
            size++;
        }
    }

    //addLast O(1)
    public void addLast(int value) {
        if (isEmpty()) {
            first = last = new Node(value);
            size++;
        } else {
            var tempNode = last;
            last = tempNode.nextNode = new Node(value);
            size++;
        }
    }

    //deleteFirst O(1)
    public void deleteFirst(){
        first = first.nextNode;
        size--;
    }

    //deleteLast O(n)
    public void deleteLast(){
        var tempNode = getPrevious(last);
        tempNode.nextNode = null;
        size--;
    }

    //contains O(n)
    public boolean contains(int value){
        var tempNode = first;
        for (int i = 0; i < size; i++){
            if (tempNode.value == value){
                return true;
            }
            tempNode = tempNode.nextNode;
        }
        return false;
    }


    //indexOf O(n)
    public int indexOf(int value){
        var tempNode = first;
        for (int i = 0; i < size; i++){
            if (tempNode.value == value){
                return i;
            }
            tempNode = tempNode.nextNode;
        }
        return -1;
    }

    //toString O(n)
    public String toString(){
       StringBuilder sb = new StringBuilder("[");
        var tempNode = first;
        for (int i = 0; i < size; i++){
            sb.append(tempNode.value + ",");
            tempNode = tempNode.nextNode;
        }
        sb.replace(sb.lastIndexOf(","),sb.lastIndexOf(",") + 1,"]");
        return sb.toString();
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
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.indexOf(40));
    }
}




