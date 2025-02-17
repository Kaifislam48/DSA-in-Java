/*
Given a number N. Print numbers from 1 to N in separate lines.

Note: Solve this problem using recursion.

Input
Only one line containing a number N (1 ≤ N ≤ 103).

Output
Print N lines according to the required above.

Example
InputCopy
5
OutputCopy
1
2
3
4
5
 */
import java.util.Scanner;

public class Print1toN {

    public static void fun1toN(int n){
        if(n == 1){
            System.out.println(n+ " ");
            return;
        }
        fun1toN(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun1toN(n);
    }
}
