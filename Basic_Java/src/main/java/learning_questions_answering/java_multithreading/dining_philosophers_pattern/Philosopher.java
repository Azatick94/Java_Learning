package learning_questions_answering.java_multithreading.dining_philosophers_pattern;

import java.util.concurrent.ThreadLocalRandom;

class Philosopher extends Thread {
    public int number;
    public Chopstick leftchopstick;
    public Chopstick rightchopstick;

    Philosopher(int num, Chopstick left, Chopstick right) {
        number = num;
        leftchopstick = left;
        rightchopstick = right;
    }

    public void run() {

        while (true) {
            //philosopher grabs the chopsticks if both are free
            leftchopstick.grab();
            System.out.println("Philosopher " + (number + 1) + " grabs left chopstick.");
            rightchopstick.grab();
            System.out.println("Philosopher " + (number + 1) + " grabs right chopstick.");
            eat();

            leftchopstick.release();
            System.out.println("Philosopher " + (number + 1) + " releases left chopstick.");
            rightchopstick.release();
            System.out.println("Philosopher " + (number + 1) + " releases right chopstick.");
        }
    }

    void eat() {
        try {
            //determines the pseudorandom number between 0 to 1000 that represents the sleep time in milliseconds
            int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
            System.out.println("Philosopher " + (number + 1) + " eats for " + sleepTime + "ms");
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
