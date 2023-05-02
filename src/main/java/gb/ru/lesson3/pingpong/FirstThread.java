package gb.ru.lesson3.pingpong;

public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println("ping");
    }
}
