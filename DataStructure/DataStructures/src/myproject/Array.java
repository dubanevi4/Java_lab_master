package myproject;

public class Array {
    private int[] array;
    int counts;

    public Array(int length){
        this.array = new int[length];
        this.counts = 0;
    }

    public void insert(int item){
        if (counts < array.length){
            this.array[counts++] = item;
        } else {
            increaseArray();
            array[counts++] = item;
        }
    }
    public void removeAt(int index){
        if (index < 0 || index >= counts)
            throw new IllegalArgumentException();

        for (int i = index; i < counts - 1; i++)
            array[i] = array[i + 1];

        counts--;
    }

    public int indexOf(int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        for (int i = 0; i < counts; i++){
            System.out.println(array[i]);
        }
    }

    public int max(){
        int max = array[0];
        for (int i = 0; i <= counts; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public Array intersect(Array other){
        var commonNumbers = new Array(counts);
        for( int item : array){
            if (other.indexOf(item) >= 0){
                commonNumbers.insert(item);
            }
        }
        return commonNumbers;
    }

    public void reverse(){
        int[] revArray = new int[counts];
        for (int i = 0; i < counts; i++){
            revArray[i] = array[counts - i - 1];
        }
        array = revArray;
    }

    public void insertAt(int item, int index){
        if (index < 0 || index > counts)
            throw new IllegalArgumentException();
        if (counts == array.length) {
            increaseArray();
        }
        for (int i = counts - 1; i >= index; i--)
            array[i + 1] = array[i];

        array[index] = item;
        counts++;
    }

    private void increaseArray(){
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }
}



class Main{
    public static void main (String[] args){
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        numbers.removeAt(1);
        numbers.print();
        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.max());
        numbers.reverse();
        numbers.insertAt(20, 2);
        numbers.print();
    }
}
