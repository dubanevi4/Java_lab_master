package myproject;
import java.util.LinkedList;

public class HashTable {
    //HashTable
    //put(k, v)
    //get(k): v
    //remove(k)
    //k: int
    //v: string
    //Collision: Chaining
    //LinkedList<Entry>[]
    //[LL, LL, LL, LL]

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value){
        var index = hash(key);
        if (entries[index] == null){
            entries[index] = new LinkedList<>();
        }

        var bucket = entries[index];
        for (var entry : bucket){
            if (entry.key == key){
                entry.value = value;
                return;
            }
        }

        bucket.addLast( new Entry(key, value));
    }

    public String get(int key){
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null){
            for (var entry : bucket){
                if (entry.key == key){
                    return entry.value;
                }
            }
        }
        return null;
    }


    private int hash (int key){
        return key % entries.length;
    }
}



class MainHashTable{
    public static void main(String[] args){
        HashTable table = new HashTable();
        
    }
}
