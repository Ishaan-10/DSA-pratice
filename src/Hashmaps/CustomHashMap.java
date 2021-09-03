package Hashmaps;

import java.util.ArrayList;

public class CustomHashMap<K,V> {
    
    ArrayList<HashNode<K,V>> bucket =new ArrayList<>();
    int count;
    int numBuckets;

    public CustomHashMap(){
        bucket= new ArrayList<>();

        for(int i=0;i<numBuckets;i++){
            bucket.add(null);
        }
    }
    private int getBucketIndex(K key){
        int hash = key.hashCode();
        return hash%numBuckets;
    }

    public void insert(K key,V value){
        int index = getBucketIndex(key);
        HashNode<K,V> head = bucket.get(index);
        while(head !=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        HashNode<K,V> newNode = new HashNode<>(key,value);
        newNode.next=head;
        bucket.set(index, newNode);
    }
    public int size(){
        return count;
    }
    public V getValue(K key){
        int index = getBucketIndex(key);
        HashNode<K,V> head= bucket.get(index);
        while(head !=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public V removeKey(K key){
        int index = getBucketIndex(key);
        HashNode<K,V> head= bucket.get(index);
        HashNode<K,V> prev=null;
        while(head !=null){
            if(head.key.equals(key)){
                if(prev!=null){
                    prev.next=head.next;
                    head.next=null;
                }else{
                    bucket.set(index, head.next);
                }
            }
            prev=head;
            head=head.next;
        }
        return null;

    }
    
    public static void main(String[] args) {
        
        CustomHashMap<Integer,Integer> map = new CustomHashMap<>();
    }

}
