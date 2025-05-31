import java.util.*;

public class DecimalToBinary {

    public static int DecToBin(int n){
         int pow=0,rem=0,binary=0;

         while(n>0){
            rem = n%2;
            binary += rem*Math.pow(10,pow);
            n /=2;
            pow++;
        }
        return binary;    
    }


    public static void main(String arg[]){
    Scanner sc = new Scanner(System.in);
     System.out.print("Enter Decimal : ");
     int n=sc.nextInt();
     System.out.println("Binary of " + n +" = " + DecToBin(n));
    }
}