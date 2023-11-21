package HashMap;

import java.util.LinkedList;

public class hashMapImplementation{
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;
        private class Node{
            K key;
            V value;
            Node(K key, V value){    //constructor
                this.key = key;
                this.value = value;
            }
        }
        private int n;   //the number of entries in map
        private LinkedList<Node>[] buckets;
        private int HashFunc(K key){
            int hc = key.hashCode();     //hashCode() - return hash value
            return (Math.abs(hc)) % buckets.length;
        }
        //traverses the ll and looks for a node with key, if found it returns it's index otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll, K key){
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        private void initBuckets(int N){      //N - capacity/size of bucket array
            buckets = new LinkedList[N];
            for(int i=0;i< buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
        }
        public MyHashMap(){     //constructor
            initBuckets(DEFAULT_CAPACITY);
        }
        public int capacity(){
            return buckets.length;
        }
        public float load(){
            return (n*1.0f)/buckets.length;
        }
        private void reHash(){
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length*2);
            n = 0;
            for(var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key, node.value);
                }
            }
        }
        public int size(){    //return the number of entries in map
            return n;
        }
        public void put(K key, V value){    //insert/update
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei == -1){    //key doesn't exist, we have to insert a new node
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {     //update case
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }
            //rehash
            if(n>=buckets.length*DEFAULT_LOAD_FACTOR){      //capacity = buckets.length
                reHash();
            }
        }
        public V get(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){    //key exist
                Node currNode  = currBucket.get(ei);
                return currNode.value;
            }
            //key doesn't exist
            return null;
        }
        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket,key);
            if(ei != -1){    //key exist
                Node currNode = currBucket.get(ei);
                V val = currNode.value;
                currBucket.remove(ei);
                n--;
                return val;
            }
            //key doesn't exist
            return null;
        }
    }
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        System.out.println("CAPACITY "+mp.capacity());
        System.out.println("LOAD FACTOR "+mp.load());
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);
        System.out.println("Testing size "+mp.size());
        mp.put("c",30);
        System.out.println("Testing size "+mp.size());
        System.out.println("Testing get");
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));
        System.out.println(mp.get("e"));
        System.out.println(mp.get("college"));   //null

        System.out.println(mp.remove("c"));    //30
        System.out.println(mp.remove("c"));    //null
        System.out.println("Testing size "+mp.size());

        System.out.println("CAPACITY "+mp.capacity());
        System.out.println("LOAD FACTOR "+mp.load());
    }
}
