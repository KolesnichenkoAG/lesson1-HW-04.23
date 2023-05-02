package gb.ru.lesson3.counter;

public class ThreadCounter implements Runnable {
    private final Counter counter;
    private final int iterations;

    public ThreadCounter(Counter counter, int iterations) {
        this.counter = counter;
        this.iterations = iterations;
    }

    @Override
    public void run() {
        for (int i = 0; i < iterations; i++) {
            counter.incrementAndGet();
        }
    }
}
