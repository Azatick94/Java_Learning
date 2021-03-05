package learning_questions_answering.java_multithreading.working_with_semaphores;

import java.util.concurrent.Semaphore;

class CountThread implements Runnable {

    CommonResource resource;
    Semaphore semaphore;
    String name;

    public CountThread(CommonResource resource, Semaphore semaphore, String name) {
        this.resource = resource;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {

        try {
            System.out.println(name + "ожидает разрешение");
            semaphore.acquire();
            resource.x=1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + resource.x);
                resource.x++;
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " освобождает разрешение");
        semaphore.release();



    }
}
