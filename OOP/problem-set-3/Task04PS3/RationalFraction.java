/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 04
 */
public class RationalFraction {
    public int x;
    public int y;

    public RationalFraction(int x, int y) {
        this.x = x;
        this.y = y;
        if (y == 0) {
            throw new ArithmeticException("на ноль не делим");
        }
    }

    static int __gcd(int a, int b) {
        if (b == 0)
            return a;
        return __gcd(b, a % b);

    }

    public RationalFraction sub(RationalFraction r2) {
        RationalFraction subr = new RationalFraction((x * r2.y) - (r2.x * y), y * r2.y);
        subr.reduce();
        return subr;
    }

    public RationalFraction mult(RationalFraction r2) {
        RationalFraction multr = new RationalFraction(x * r2.x, y * r2.y);
        multr.reduce();
        return multr;
    }

    public RationalFraction div(RationalFraction r2) {
        RationalFraction divr = new RationalFraction(x * r2.y, y * r2.x);
        divr.reduce();
        return divr;
    }

    public RationalFraction reduce() {
        int d;
        d = __gcd(x, y);
        x = x / d;
        y /= d;
        return this;
    }

    public RationalFraction add(RationalFraction r2) {
        RationalFraction addr = new RationalFraction((x * r2.y) + (r2.x * y), y * r2.y);
        addr.reduce();
        return addr;
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }

    public Double getDouble() {
        Double getDoublee = Double.valueOf(x / y);
        return getDoublee;
    }

}
