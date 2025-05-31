import java.util.*;

public class start{
    public static void main(String arg[]) {
        System.out.print("Hello world\n"); 

    Scanner sc = new Scanner(System.in);
    System.out.println("Sum Of Two Numbers:");
    System.out.print("Enter a = ");
    int a = sc.nextInt();
    System.out.print("Enter b = ");
    int b = sc.nextInt();
    int sum = a+b;
    System.out.println("Sum of " + a + " + " + b + " = " + sum);
    
    }
}