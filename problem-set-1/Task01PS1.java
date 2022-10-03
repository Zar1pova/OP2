/**
* @author Dina Zaripova
* 01-961
* Problem Set 1 Task 01
*/
import java.util.Scanner;

public class Task01PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b < n-a; b++) {
                System.out.print("  ");
            }
            for (int b = a; b > 0; b--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
