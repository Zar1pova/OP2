/**
* @author Dina Zaripova
* 01-961
* Problem Set 1 Task 05 
*/
import java.util.Scanner;
public class Task05PS1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ten=0;
    int a = 1;
    int last;
    int first;
    first = n % 10;
    n = n / 10;
    int length = String.valueOf(n).length();
    for (int i = 0; i <= length; i++) {
        last = n % 10;
        a = 2*a;
        ten += last * a;
        n = n / 10;
    }
    System.out.println(ten+first);
    }
}
