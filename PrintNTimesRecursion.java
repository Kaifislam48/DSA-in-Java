import java.util.Scanner;
public class PrintNTimesRecursion{
    public static void fun(int n){
        if(n == 1){
            System.out.println("I love Recursion");
            return;
        }
        System.out.println("I love Recursion");
        fun(n-1);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n);
    }
}