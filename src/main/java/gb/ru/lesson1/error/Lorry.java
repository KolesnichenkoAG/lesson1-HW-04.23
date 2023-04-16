package gb.ru.lesson1.error;

public class Lorry extends Car implements Moveable, Stopable {
    // добавляем модификатор доступа public и имплементацию перед указанием интерфейсов
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    void open() {

    }
}
