/*
Friends Pairing Problem:--- 
Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up....

-------Company = Goldman Sachs--------
*/
import java.util.Scanner;
public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        //Single Choice
        int fnm1 = friendsPairing(n-1);

        //Pairing Choice
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        
        //Total Choices---
        int totalWays = fnm1 + pairWays;
        return totalWays; // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(friendsPairing(n));
    }
}
