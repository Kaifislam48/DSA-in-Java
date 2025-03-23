import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        int sum = a + b;
        int product = a * b;
        int remainder = a % b;
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
        System.out.println("Reminder is "+remainder);
        sc.close();
    }
}
