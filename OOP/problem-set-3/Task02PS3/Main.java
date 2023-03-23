/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 02 
 */
public class Main {
    public static void main(String[] args) {
        RationalFraction r1 = new RationalFraction(1, 3);
        RationalFraction r2 = new RationalFraction(4, 8);
        RationalFraction r3 = r2.add(r1);
        RationalFraction r4 = r2.sub(r1);
        RationalFraction r5 = r2.mult(r1);
        RationalFraction r6 = r2.div(r1);
        double a = r1.value();
        System.out.println("Сложение " + r3);
        System.out.println("Вычитание " + r4);
        System.out.println("Умножение " + r5);
        System.out.println("Деление " + r6);
        System.out.println("Десятичное значение " + a);
    }
}