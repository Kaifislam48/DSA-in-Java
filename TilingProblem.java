import java.util.Scanner;
public class TilingProblem {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        
        //Vertical Choice
        int fnm1 = tilingProblem(n-1);
        
        //Horizontal Choice
        int fnm2 = tilingProblem(n-2);
        int totalWays = fnm1 + fnm2;

        return totalWays;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(tilingProblem(n));
    }
}
