import java.util.Scanner;

public class SummationUsingRecursion {
    public static long summation(long arr[], int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + summation(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(summation(arr, n));
    }
}