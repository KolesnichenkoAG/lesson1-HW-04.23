package gb.ru.lesson1.polymorphism;

public class Triangle extends Shape {

    @Override
    public void calculatingTheArea() {
        System.out.println("Площадь треугольника равна: 0,5 умножить на основание и высоту");
    }
}
