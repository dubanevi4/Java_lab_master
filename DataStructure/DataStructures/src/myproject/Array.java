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
            int[] newArray = new int[array.length + 1];
            for (int i = 0; i < array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
            array[counts++] = item;
        }
    }
    public void removeAt(int index){
        if (index >= 0 && index <= counts){
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++){
                if (i != index){
                    newArray[j] = array[i];
                    j++;
                }
            }
            array = newArray;
            counts--;
        } else {
            throw   new IllegalArgumentException();
        }
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
        System.out.println(numbers.indexOf(100));
    }
}
