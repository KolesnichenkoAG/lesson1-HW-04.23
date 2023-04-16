package gb.ru.lesson1.polymorphism;

public class Formula {

    public void formulaShape(Shape shape) {
        System.out.println("Формула фигуры:");
        shape.calculatingTheArea();
    }
}
