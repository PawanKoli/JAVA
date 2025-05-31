import java.util.*;

public class Overloading{
    // Overloading Using Parameters
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }


    // Overloading Using Data Types
    /* public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    } */

    
    public static void main(String arg[]){
         System.out.println("Sum = " + sum(5,2));
         System.out.println("Sum = " + sum(3,2,2));
         //System.out.println("Sum = " + sum(4.8f,2.2f));


    }
}