package gb.ru.lesson3.counter;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentCounter myCounter = new ConcurrentCounter();
        myCounter.start();
    }
}
