package myproject;

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

    private LinkedList<Entry> entries = new LinkedList[5];

    public void put(int key, String value){
        Entry entry = getEntry(key);
        if (entry != null){
            entry.value = value;
        }
        return;
    }

    public String getEntry(int key){

    }
}



class MainHashTable{
    public static void main(String[] args){
        HashTable<Entry>
    }
}
