package learning_questions_answering.java_multithreading.count_down_latch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {

    private List<List<Integer>> calcResults = Collections.synchronizedList(new ArrayList<>());
    private Random random = new Random();
    private CountDownLatch latch;
    private int LATCH_COUNTER;
    private int THREAD_JOB_COUNT;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("App has Started !!!");
        CountDownLatchDemo demo = new CountDownLatchDemo();
        demo.runLatch();

        List<List<Integer>> calcResults = demo.calcResults;

        int sum = 0;
        for (List<Integer> integerList : calcResults) {
            int reduce = integerList.stream().reduce(0, Integer::sum);
            sum += reduce;
        }

        System.out.println("LIST SIZE IS: " + calcResults.size());
        System.out.println("RESULT IS: " + sum);
    }

    public void runLatch() throws InterruptedException {
        LATCH_COUNTER = 5;
        latch = new CountDownLatch(LATCH_COUNTER);
        THREAD_JOB_COUNT = 10;

        System.out.println("Latch count: " + latch.getCount());

        // starting threads
        for (int i = 0; i < LATCH_COUNTER; i++) {
            new Thread(new ThreadJob()).start();
        }

        // waiting for latch for 5 seconds or waiting until latch == 0
        latch.await(5, TimeUnit.SECONDS);
    }

    class ThreadJob implements Runnable {
        @Override
        public void run() {
            List<Integer> items = new ArrayList<>();

            for (int i = 0; i < THREAD_JOB_COUNT; i++) {
                try {
                    Thread.sleep(random.nextInt(10) * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                items.add(random.nextInt(10));
            }
            calcResults.add(items);

            latch.countDown();
            System.out.println("Latch count: " + latch.getCount());
        }
    }
}
