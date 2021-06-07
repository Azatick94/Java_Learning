package learning_questions_answering.java_multithreading.multiple_locks_synchronized_code_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private Random random = new Random();

    private Object lock1 = new Object();
    private Object lock2 = new Object();


    public void main() {
        System.out.println("Hello!!!");
        System.out.println("Starting");

        long timeStart = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                process();
            }
        });

        thread1.start();
        thread2.start();

        try {
            // killing threads
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long timeEnd = System.currentTimeMillis();

        System.out.println("Time took: "+(timeEnd-timeStart)+" milliseconds!" );
        System.out.println("List1 size: "+list1.size());
        System.out.println("List2 size: "+list2.size());

    }

    public void process() {
        for (int i = 0; i < 1000; i++) {
            stage1();
            stage2();
        }
    }

    public void stage1() {

        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list1.add(random.nextInt(100));
    }

    public void stage2() {

        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list2.add(random.nextInt(100));
    }





}
