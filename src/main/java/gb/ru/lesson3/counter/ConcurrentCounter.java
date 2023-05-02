package gb.ru.lesson3.counter;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentCounter {

    private static final int ITERATIONS = 150;

   public void start() throws InterruptedException {
       Lock lock = new ReentrantLock();
       Counter counter = new Counter(lock);

       Thread thread1 = new Thread(new ThreadCounter(counter, ITERATIONS));
       Thread thread2 = new Thread(new ThreadCounter(counter, ITERATIONS));
       Thread thread3 = new Thread(new ThreadCounter(counter, ITERATIONS));

       thread1.start();
       thread2.start();
       thread3.start();

       thread1.join();
       thread2.join();
       thread3.join();

       System.out.println("Счетчик итого: " + counter.getValue());
   }
}
