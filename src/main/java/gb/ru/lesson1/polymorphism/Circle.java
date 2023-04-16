package gb.ru.lesson1.polymorphism;

public class Circle extends Shape {

    @Override
    public void calculatingTheArea() {
        System.out.println("Площадь круга равна: пи умножить на r2");
    }
}
