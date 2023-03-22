package learning_questions_answering.java_collections.blockingqueueexample;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private BlockingQueue<Message> queue;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            Message message = new Message("" + i);
            try {
                Thread.sleep(i);
                queue.put(message);
                System.out.println("Produced message with value = " + message.getMessage());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        // exit message
        Message messageExit = new Message("Exit");

        try {
            queue.put(messageExit);
            System.out.println("Produced message with value = " + messageExit.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(String.format("Producer %s finished work!!!", Thread.currentThread().getName()));
    }
}
