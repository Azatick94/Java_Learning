package leetcode._705_Design_HashSet;

import java.util.LinkedList;

public abstract class AbstractHashSet {

    protected int numberOfBuckets = 769;
    protected LinkedList<Integer>[] buckets;

    public abstract void add(int key);

    public abstract void remove(int key);

    public abstract boolean contains(int key);

}
