package gb.ru.lesson3.pingpong;

public class Main {

    public static void main(String[] args) {
        FirstThread thread = new FirstThread();
        SecondThread thread1 = new SecondThread();
        thread.start();
        thread1.start();

        for (int i = 0; i < 10; i++) {
            thread.run();
            thread1.run();
        }
    }
}
