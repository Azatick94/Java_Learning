package learning_questions_answering.java_multithreading.atomics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class WithoutAtomics {

    private static volatile int count = 0;

    static void add() {
        count++;
    }

    static class MyThread implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                add();
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        count = 0;
        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<?>> tasks = new ArrayList<>();

        for (int i=0; i<10; i++) {
            Future<?> future = executor.submit(new MyThread());
            tasks.add(future);
        }

        for (Future<?> task: tasks) {
            task.get(1000, TimeUnit.SECONDS);
        }
        executor.shutdown();

        System.out.println("Should be 1000");
        System.out.println("Result "+ count);
    }

}
