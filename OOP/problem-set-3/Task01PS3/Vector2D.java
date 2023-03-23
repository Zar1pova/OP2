/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 3 Task 01 
 */
public class Vector2D {
    public double x;
    public double y;
    public Vector2D (double x, double y){
        this.x=x;
        this.y=y;
    }
    public Vector2D add(Vector2D v2) {
        Vector2D addv = new Vector2D(x + v2.x, y + v2.y);
        return addv;
    }
    public Vector2D sub(Vector2D v2){
        Vector2D subv = new Vector2D(x - v2.x, y - v2.y);
        return subv;
    }
    public Vector2D mult(double z){
        Vector2D multv =new Vector2D(x * z , y * z);
        return multv;
    }
    public double length(Vector2D v2){
        double lengthv = Math.sqrt((x - v2.x) * (x - v2.x) + (y - v2.y) * (y - v2.y));
        return lengthv;
    }
    public double scalarProduct(Vector2D v2){
        double scalarProduct = (x * v2.x) +  (y * v2.y);
        return scalarProduct;
    }
    @Override
    public String toString (){
        return "("+x+", " + y + ")";
    }



}