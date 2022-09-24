/**
 * @author DinaZaripova
 * 01-961
 * Problem Set 1 Task 04
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, j = 1;
        for (int i = 1; i <= n; i++)
        {
            a = a + j;
            j = (j * 10) + 1;
            System.out.println(a);
    }
}}