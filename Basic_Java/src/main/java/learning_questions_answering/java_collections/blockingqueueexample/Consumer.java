package learning_questions_answering.java_collections.blockingqueueexample;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        try {
            Message msg;
            while (queue.peek() != null && queue.peek().getMessage() != null && !queue.peek().getMessage().equals("Exit")) {

                msg = queue.take();
                Thread.sleep(100);

                String text = String.format("Consumed number %s message with value = " + msg.getMessage(), threadName);
                System.out.println(text);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("Consumer %s finished work!!!", threadName));
        System.out.println("Queue size = " + queue.size());
    }


}
