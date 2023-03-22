package learning_questions_answering.java_multithreading.dining_philosophers_pattern;

public class DiningPhilosophersProblem {

    // number of pholosophers and chopsticks, they are same
    private static int amount = 5;
    private static Philosopher philosophers[] = new Philosopher[amount];
    private static Chopstick chopsticks[] = new Chopstick[amount];

    public static void main(String args[]) {

        // create chopstics
        for (int i = 0; i < amount; i++) {
            chopsticks[i] = new Chopstick();
        }

        // create philosophers and start them
        for (int i = 0; i < amount; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % amount]);
            philosophers[i].start();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        while (true) {
            try {
                Thread.sleep(1000);
                boolean deadlock = true;
                //for each loop iterates over chopsticks
                for (Chopstick cs : chopsticks) {
                    if (cs.isFree()) {
                        deadlock = false;
                        break;
                    }
                }
                //deadlock occurs if sleep time is 1000ms it means each philosopher is eating
                if (deadlock) {
                    Thread.sleep(1000);
                    System.out.println("Everyone Eats");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

        System.out.println("Exit The Program!");
        System.exit(0);
    }

}
