package learning_questions_answering.java_multithreading.worked_example_low_level_synchronization_9;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

    // создание списка.
    private LinkedList<Integer> lst = new LinkedList<>();
    private final Integer LIMIT = 10;
    private Object lock = new Object();

    public Processor() {
    }

    public void produce() throws InterruptedException {
        // method to add random value to list

        while (true) {

            synchronized (lock) {

                // если больше лимита то блочим продюсер
                while (lst.size()>LIMIT) {
                    lock.wait();
                }

                Random random = new Random();
                Integer valueToAdd = random.nextInt(100);
                System.out.println("Adding "+valueToAdd);
                Thread.sleep(1000);
                lst.add(valueToAdd);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        // method to remove value from list

        while (true) {

            synchronized (lock) {


                while (lst.size()==0) {
                    lock.wait(); // если нет элементов, то останавливаем консумер.
                }

                Integer valueToRemove = lst.getFirst();
                System.out.println("Removing "+valueToRemove);
                lst.removeFirst();
                lock.notify(); // убрали элемент, пора предупредить.
            }

        }

    }


}
