package gb.ru.lesson1.polymorphism;

public class TestShape {

    public static void main(String[] args) {
        Formula formula = new Formula();

        Circle a = new Circle();
        Square b = new Square();
        Triangle c = new Triangle();

        formula.formulaShape(a);
        formula.formulaShape(b);
        formula.formulaShape(c);
    }
}
