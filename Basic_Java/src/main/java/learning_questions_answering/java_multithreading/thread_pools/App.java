package learning_questions_answering.java_multithreading.thread_pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable {

    private int id;
    public Processor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Starting the "+id+"!");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed "+id+"!");
    }
}


public class App {

    public static void main(String[] args) {
        // please read the docs. executorService is a service to manage Threads.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            // submitting i-thread to run the thread.
            executorService.submit(new Processor(i));
        }

        // stopping accepting new threads and waiting for finished running threads.
        executorService.shutdown();

        System.out.println("All tasks submitted!!!");


        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks completed");




    }
}
