/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 04
 */
public class Main {
    public static void main(String[] args) {
        RationalFraction r1 = new RationalFraction(4, 1);
        RationalFraction r2 = new RationalFraction(5, 1);
        RationalFraction r3 = new RationalFraction(1, 1);
        RationalFraction r4 = new RationalFraction(5, 5);
        RationalVector2D rv1 = new RationalVector2D (r1, r2);
        RationalVector2D rv2 = new RationalVector2D (r3, r4);
        RationalVector2D rv3 = rv2.add(rv1);
        System.out.println("Сложение " + rv3.toString());
        Double lengthv = rv2.lengthv(r1, r2, r3, r4);
        System.out.println("Длина " + lengthv);
        Double scalarProductv = rv2.scalarProductv(rv1);
        System.out.println("Скалярное произведение " + scalarProductv);
    }
}