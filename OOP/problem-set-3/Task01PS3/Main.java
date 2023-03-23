/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 01 
 */
public class Main {
    public static void main(String[] args) {
        double z = 12;
        Vector2D v1 = new Vector2D(2, 4);
        Vector2D v2 = new Vector2D(1, 2);
        Vector2D v3 = v2.add(v1);
        Vector2D v4 = v2.sub(v1);
        Vector2D v5 = v2.mult(z);
        double a = v2.length(v1);
        double b = v2.scalarProduct(v1);

        System.out.println("Сложение " + v3);
        System.out.println("Вычитание " + v4);
        System.out.println("Умножение "+ v5);
        System.out.println("Длина " + a);
        System.out.println("Скалярное произведение " + b);

    }
}
