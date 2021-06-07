package learning_questions_answering.java_multithreading.working_with_semaphores;

import java.util.concurrent.Semaphore;

public class Program {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource commonResource = new CommonResource();

        Thread t1 = new Thread(new CountThread(commonResource, semaphore, "thread-1"));
        Thread t2 = new Thread(new CountThread(commonResource, semaphore, "thread-2"));
        Thread t3 = new Thread(new CountThread(commonResource, semaphore, "thread-3"));

        t1.start();
        t2.start();
        t3.start();
    }

}

class CommonResource {
    int x = 0;
}






