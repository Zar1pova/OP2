/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 04
 */
public class RationalVector2D {
    public RationalFraction n;
    public RationalFraction m;
    RationalFraction r1;
    RationalFraction r2;
    RationalFraction r3;
    RationalFraction r4;

    public RationalVector2D (RationalFraction n, RationalFraction m){
        this.n=n;
        this.m=m;
    }
    RationalVector2D add(RationalVector2D rv2){
        RationalVector2D addr = new RationalVector2D (n.add(rv2.n), m.add(rv2.m));
        return addr;
    }
    @Override
    public String toString(){
        return "(" + n.toString() + ", " + m.toString() + ")";
    }
    public Double lengthv(RationalFraction r1, RationalFraction r2, RationalFraction r3, RationalFraction r4){
        Double length = Math.sqrt(((r1.getDouble() - r3.getDouble()) * (r1.getDouble() - r3.getDouble())) + ((r2.getDouble() - r4.getDouble()) * (r2.getDouble() - r4.getDouble())));
        return length;
    }
    Double scalarProductv (RationalVector2D rv2){
        Double scalarProduct = (n.mult(rv2.n).getDouble() + m.mult(rv2.m).getDouble());
        return scalarProduct;
    }

}
