package learning_questions_answering.java_collections.blockingqueueexample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

    public static void main(String[] args) {
        //Creating BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        // starting producer and consumer
        Thread threadProducer = new Thread(producer);
        Thread threadConsumer1 = new Thread(consumer, "Consumer_1");
        Thread threadConsumer2 = new Thread(consumer, "Consumer_2");

        threadProducer.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        threadConsumer1.start();
        threadConsumer2.start();
        System.out.println("Producer and Consumer has been started");

        try {
            threadProducer.join();
            threadConsumer1.join();
            threadConsumer2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
