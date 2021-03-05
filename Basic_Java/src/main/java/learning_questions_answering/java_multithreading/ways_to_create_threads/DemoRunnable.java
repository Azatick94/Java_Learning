package learning_questions_answering.java_multithreading.ways_to_create_threads;

public class DemoRunnable {

    public static void main(String[] args) {
        // создание потока с помощью имплеменирования интерфейса Runnable.

        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        thread1.start();
        thread2.start();

    }


    public static class MyThread implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" - Hello "+i);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }



}
