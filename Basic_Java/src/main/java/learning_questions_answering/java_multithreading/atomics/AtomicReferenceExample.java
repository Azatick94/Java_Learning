package learning_questions_answering.java_multithreading.atomics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AtomicReferenceExample {

    private static final AtomicReference<String> atomicRef = new AtomicReference<>("Initial Value+0");

    public static void main(String[] args) {

        int n = 1000;
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<?>> futureList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Future<?> future = executorService.submit(new MyThread());
            futureList.add(future);
        }

        for (Future<?> future : futureList) {
            try {
                future.get(10, TimeUnit.SECONDS);
            } catch (RuntimeException | InterruptedException | ExecutionException | TimeoutException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        assertEquals("Initial Value+" + n, atomicRef.get());
        System.out.printf("Expected = %s and Actual value = %s", "Initial Value+" + n, atomicRef.get());

    }

    public static class MyThread implements Runnable {

        @Override
        public void run() {
            Random random = new Random();
            System.out.println("Thread number " + Thread.currentThread().getName() + "_" + random.nextInt() + " started!");

            while (true) {
                String currentValue = atomicRef.getAcquire();

                String[] split = currentValue.split("\\+");
                int newInt = Integer.parseInt(split[1]) + 1;
                String newValue = split[0] + "+" + newInt;

                if (atomicRef.compareAndSet(currentValue, newValue)) break;
            }

        }
    }

}


