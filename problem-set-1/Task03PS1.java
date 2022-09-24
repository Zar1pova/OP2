/**
* @author DinaZaripova
* 01-961
* Problem Set 1 Task 03
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float l;
        float r=0;
        for (m = 1; m <= n; m++) {
            l= (float)(m-1)*(m-1)/(2*m);
            r=l+r;
        }
        System.out.println(r);
    }
}