package learning_questions_answering.java_multithreading.basic_thread_synchronization;

public class DemoSynch {

    public static void main(String[] args) throws InterruptedException {

        // создаем и запускаем поток
        MyThread thread = new MyThread();
        thread.start();

        Thread.sleep(1000);

        // пытаемся остановить поток
        thread.shutdownThread();


    }


    public static class MyThread extends Thread {

        private volatile boolean running = true;

        @Override
        public void run() {

            while (running) {
                try {
                    System.out.println("Hello");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void shutdownThread() {
            running = false;
        }

    }






}
