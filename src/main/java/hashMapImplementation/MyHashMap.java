package hashMapImplementation;

public class MyHashMap<K,V> {
    public static final int INITIAL_CAPACITY = 1 << 4;
    public static final int MAX_CAPACITY = 1 << 30;
    public Entry[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[INITIAL_CAPACITY];
    }

    public MyHashMap(int capacity){
        int tableSize = tableSizeFor(capacity-1);
        hashTable = new Entry[tableSize] ;
    }

    final int tableSizeFor(int i){
        if (i <= 0)
            return i == 0 ? 32 : 0;
        int n = 31;
        if (i >= 1 << 16) { n -= 16; i >>>= 16; }
        if (i >= 1 <<  8) { n -=  8; i >>>=  8; }
        if (i >= 1 <<  4) { n -=  4; i >>>=  4; }
        if (i >= 1 <<  2) { n -=  2; i >>>=  2; }
        int val = -1 >>> n - (i >>> 1);
        return (val < 0) ? 1 : (val >= MAX_CAPACITY) ? MAX_CAPACITY : val + 1;
    }

    static class Entry<K,V>{
        public K key;
        public V value;
        public Entry next;

        Entry(K k, V v){
            key = k;
            value = v;
        }
    }

    public void put(K key, V value){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];

        if(node==null){
            Entry newNode = new Entry(key, value);
            hashTable[hashCode] = newNode;
        }
        else{
            Entry previousNode = node;
            while(node!=null){
                if(node.key.equals(key)){
                    node.value = value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            previousNode.next = new Entry(key,value);
        }
    }

    public V get(K key){
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];
        while(node!=null){
            if(node.key.equals(key)){
                return (V) node.value;
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashMap<Integer, String> mp = new MyHashMap<>();
        mp.put(1,"A");
        mp.put(2,"B");
        mp.put(1,"C");
        System.out.println(mp.get(1));
        System.out.println(mp.get(2));
    }
}


