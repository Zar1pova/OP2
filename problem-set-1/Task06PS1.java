/**
* @author Dina Zaripova
* 01-961
* Problem Set 1 Task 06
*/
import java.util.Random;
import java.util.Scanner;
public class Task06PS1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr1;
    arr1 = new int[n];
    int [] arr2;
    arr2 = new int[n];
    Random r  = new Random();
    for (int i = 0; i < n; i++) {
        arr1[i] = r.nextInt(9)+1;
        System.out.print(arr1[i]+" ");
        }
    System.out.println();
    for (int m = 0; m < arr2.length; m++) {
        arr2[m] = arr1[arr1.length - m-1];
        System.out.print(arr2[m]+" ");
    }
}}
