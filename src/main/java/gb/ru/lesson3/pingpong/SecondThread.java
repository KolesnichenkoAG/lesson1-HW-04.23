package gb.ru.lesson3.pingpong;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println("pong");
    }
}
