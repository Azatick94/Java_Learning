package leetcode.Queue_Stack_Card.circularQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    @Test
    public void testQueue() {

        int k = 5;
        int value = 10;

        MyCircularQueue obj = new MyCircularQueue(k);
        boolean param_1 = obj.enQueue(value);
        boolean param_2 = obj.deQueue();
        int param_3 = obj.Front();
        int param_4 = obj.Rear();
        boolean param_5 = obj.isEmpty();
        boolean param_6 = obj.isFull();

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);
        System.out.println(param_6);

    }

}
