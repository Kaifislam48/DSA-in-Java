import java.util.*;

public class FactorialUsingRecursion{
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        //int fnm1 = factorial(n-1);
        factorial(n-1);
        //int fn = n * fnm1;
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
}