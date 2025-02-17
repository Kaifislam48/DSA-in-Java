/*
Given a number N. Print all numbers from N to 1 separated by a single space.

Note: Solve this problem using recursion.

Input
Only one line containing a number N (1 ≤ N ≤ 103).

Output
Print from N to 1 separated by a single space.

Example
InputCopy
4
OutputCopy
4 3 2 1
Note
Make sure don't print any leading or trailing spaces.
 */

 import java.util.Scanner;
 public class PrintNto1{
     public static void funNto1(int n){
         if(n==1){
             System.out.println(n);
             return;
         }
         System.out.print(n +" ");
         funNto1(n-1);
     }
     public static void main(String args[]){
         int n;
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         funNto1(n);
     }
 }