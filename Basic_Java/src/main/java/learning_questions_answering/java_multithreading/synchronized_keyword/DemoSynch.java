package learning_questions_answering.java_multithreading.synchronized_keyword;

public class  DemoSynch {

    // пытаемся с двумя потоками увеличить count;
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {

        // creating 2 threads
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        // starting threads
        t1.start();
        t2.start();

        // ждем когда треды завершатся
        t1.join();
        t2.join();

        // смотрим что получилось с переменной count;
        System.out.println("Count is: " + count);

    }


}
