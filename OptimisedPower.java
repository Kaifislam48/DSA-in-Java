import java.util.Scanner;

public class OptimisedPower {
    public static int optimisedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        //int halfPowerSq = optimisedPower(x, n/2) * optimisedPower(x, n/2);
        
        int halfPower = optimisedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2!=0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(optimisedPower(x, n));

    }
}
