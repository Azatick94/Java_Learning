package learning_questions_answering.java_multithreading.atomics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithAtomics {

    private static AtomicInteger count = new AtomicInteger(0);

    static void add() {
        count.incrementAndGet();
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread started = " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++) {
                add();
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        count = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<?>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Future<?> future = executor.submit(new MyThread());
            tasks.add(future);
        }

        for (Future<?> task : tasks) {
            task.get(1000, TimeUnit.SECONDS);
        }
        executor.shutdown();

        assertEquals(1000, count.get());
        System.out.printf("Expected = %s and Actual value = %s", 1000, count.get());
    }

}
