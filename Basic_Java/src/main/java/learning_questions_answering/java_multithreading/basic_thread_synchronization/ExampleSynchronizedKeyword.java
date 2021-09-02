package learning_questions_answering.java_multithreading.basic_thread_synchronization;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

// https://www.baeldung.com/java-synchronized
public class ExampleSynchronizedKeyword {

    private int sum = 0;

    public synchronized void calculate() {
        setSum(getSum() + 1);
    }

    public void performSynchronisedTaskUsingBlock() {
        synchronized (this) {
            setSum(getSum() + 1);
        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Test
    public void testMultipleThread() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ExampleSynchronizedKeyword summation = new ExampleSynchronizedKeyword();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        assertEquals(1000, summation.getSum());
    }

    @Test
    public void testPerformSynchronisedTaskUsingBlock() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        ExampleSynchronizedKeyword summation = new ExampleSynchronizedKeyword();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::performSynchronisedTaskUsingBlock));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        assertEquals(1000, summation.getSum());
    }
}
