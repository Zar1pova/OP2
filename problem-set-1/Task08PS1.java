/**
 * @author Dina Zaripova
 * 01-961
 * Problem Set 1 Task 07
 */
import java.util.Random;
import java.util.Scanner;
public class Task08PS1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr;
        arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(9) + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Task08PS1 ob = new Task08PS1();
        ob.sort(arr);
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("наибольшая сумма ");
        System.out.print(arr[n-1]+arr[n-2]);
        System.out.println();
        System.out.print("наименьшая сумма ");
        System.out.print(arr[0]+arr[1]);
    }
    public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = n/2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest] )
            largest = r;
        if (largest != i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}
