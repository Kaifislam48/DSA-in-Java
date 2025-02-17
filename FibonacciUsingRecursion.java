/*
Fibonacci time limit per test1 second
memory limit per test256 megabytes
Given a number N. Print the value of the Nth Fibonacci number.


Note: Solve this problem using recursion.

Input
Only one line containing a number N (1 ≤ N ≤ 30).

Output
Print the value of the Nth Fibonacci number.

Example
InputCopy
5
OutputCopy
3 
*/
import java.util.*;
public class FibonacciUsingRecursion {

    public static int fib(int n){
        if(n == 1 || n == 2){
            return n-1;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));

    }
}
