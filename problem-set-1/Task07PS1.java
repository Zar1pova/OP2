/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 1 Task 07
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task07PS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        int sum2=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum2 += arr[i][arr.length -1 -i];
                }
            }
        }
        if (sum>sum2) {
            System.out.println(sum);
        }
        if (sum2>sum) {
            System.out.println(sum2);
        }
    }}
