import java.util.*;
public class AreaCircle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * rad * rad;
        System.out.println("Area of Circle is "+area);
        sc.close();
    }
}
