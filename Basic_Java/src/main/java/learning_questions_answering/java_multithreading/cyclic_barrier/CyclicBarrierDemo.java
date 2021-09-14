package learning_questions_answering.java_multithreading.cyclic_barrier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

    private CyclicBarrier cyclicBarrier;
    private List<List<Integer>> partialResults = Collections.synchronizedList(new ArrayList<>());
    private Random random = new Random();
    // number of random elements to add to list
    private int NUM_PARTIAL_RESULTS;
    // number of thread to create
    private int NUM_WORKERS;

    public static void main(String[] args) {
        CyclicBarrierDemo demo = new CyclicBarrierDemo();
        demo.runSimulation(5, 10);
    }

    public void runSimulation(int numWorkers, int numberOfPartialResults) {
        NUM_PARTIAL_RESULTS = numberOfPartialResults;
        NUM_WORKERS = numWorkers;

        cyclicBarrier = new CyclicBarrier(5, new FinalThreadResultsAggregator());

        System.out.println("Spawning " + NUM_WORKERS
                + " worker threads to compute "
                + NUM_PARTIAL_RESULTS + " partial results each");

        for (int i = 0; i < NUM_WORKERS; i++) {
            Thread worker = new Thread(new RandomListOfNumbersGenerator());
            worker.setName("Thread " + i);
            worker.start();
        }
    }

    class RandomListOfNumbersGenerator implements Runnable {
        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();
            List<Integer> listRandomNumbers = new ArrayList<>();

            // Crunch some numbers and store the partial result
            for (int i = 0; i < NUM_PARTIAL_RESULTS; i++) {
                Integer num = random.nextInt(10);
                System.out.println(thisThreadName
                        + ": Crunching some numbers! Final result - " + num);
                listRandomNumbers.add(num);
            }
            partialResults.add(listRandomNumbers);

            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    class FinalThreadResultsAggregator implements Runnable {
        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();

            System.out.println(
                    thisThreadName + ": Computing sum of " + NUM_WORKERS
                            + " workers, having " + NUM_PARTIAL_RESULTS + " results each.");
            int sum = 0;

            for (int i = 0; i < NUM_WORKERS; i++) {
                List<Integer> integerList = partialResults.get(i);
                int reduce = integerList.stream().reduce(0, Integer::sum);
                sum += reduce;
            }
            System.out.println();
            System.out.println(thisThreadName + ": Final result = " + sum);
        }
    }
}
