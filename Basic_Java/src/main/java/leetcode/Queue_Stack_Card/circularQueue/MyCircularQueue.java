package leetcode.Queue_Stack_Card.circularQueue;

class MyCircularQueue {

    private Integer head = null;
    private Integer tail = null;
    private int[] elements;
    private int arrSize;


    public MyCircularQueue(int k) {
        this.elements = new int[k];
        this.arrSize = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            head = 0;
            tail = 0;
            elements[0] = value;
        } else {
            tail++;
            elements[tail % arrSize] = value;
        }
        return true;
    }

    public boolean deQueue() {

        if (isEmpty()) return false;

        if (getSize() == 1) {
            head = null;
            tail = null;
        } else {
            head++;
        }
        return true;
    }

    public int Front() {
        if (!isEmpty()) return elements[head % arrSize];
        return -1;
    }

    public int Rear() {
        if (!isEmpty()) return elements[tail % arrSize];
        return -1;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == arrSize;
    }

    public int getSize() {
        boolean isHeadAndTailIsNull = head == null && tail == null;
        if (isHeadAndTailIsNull) return 0;
        return tail - head + 1;
    }


}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
