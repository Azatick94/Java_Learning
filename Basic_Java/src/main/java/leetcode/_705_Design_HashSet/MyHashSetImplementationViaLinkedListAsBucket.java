package leetcode._705_Design_HashSet;

import java.util.LinkedList;

class MyHashSetImplementationViaLinkedListAsBucket extends AbstractHashSet {

    public MyHashSetImplementationViaLinkedListAsBucket() {
        this(769);
    }

    public MyHashSetImplementationViaLinkedListAsBucket(int buckets) {
        this.numberOfBuckets = buckets;
        this.buckets = new LinkedList[numberOfBuckets];
        for (int i=0; i<this.numberOfBuckets; i++) {
            this.buckets[i] = new LinkedList();
        }
    }



    public void add(int key) {
        if (!contains(key)) {
            getBucketByKey(key).addFirst(key);
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            LinkedList<Integer> bucket = getBucketByKey(key);
            bucket.remove(bucket.indexOf(key));
        }
    }

    public boolean contains(int key) {
        LinkedList<Integer> bucket = getBucketByKey(key);
        return bucket.contains(key);
    }

    private LinkedList<Integer> getBucketByKey(int key) {
        return buckets[hashFunction(key)];
    }

    private int hashFunction(int key) {
        return key % numberOfBuckets;
    }

}
