package learning_questions_answering.java_multithreading.wait_and_notify;

import java.util.Scanner;

public class Processor {

    public void produce() throws InterruptedException {

        synchronized (this) {
            System.out.println("Producer thread running ...");
            wait(); // освобождается мютекс и ждем команды notify
            System.out.println("Resumed.");
        }

    }

    public void consume() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);

        synchronized (this) {
            // выполняется этот блок кода после wait команды
            System.out.println("Waiting for return key.");
            scanner.nextLine();
            System.out.println("Return key pressed.");
            notify(); // сообщаем что объект освобожден и можно запустить последний остановленный поток на объекте this.
            Thread.sleep(5000);
        }

    }


}
