package learning_questions_answering.java_multithreading.ways_to_create_threads;

public class DemoThread {

    public static void main(String[] args) {

        // создаем два потока и запускаем их. Эти два потока работают параллельно.
        MyThread thread1 = new MyThread();
        thread1.start();

        MyThread thread2 = new MyThread();
        thread2.start();
    }


    static class MyThread extends Thread {
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
