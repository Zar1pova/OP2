/**
* @author Dina Zaripova
* 01-961
* Problem Set 1 Task 02
*/
import java.util.Scanner;
public class Task02PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k;
        for (k= sc.nextInt(); k <= m; k++) {
            if (k % 3 == 0) {
                System.out.println(k);
            }
        }
    }
}
