import java.util.*;

public class BionomialToDecimal {

    public static int BioToDec(int n){
        int pow=0,decimal=0;
        
        while(n>0){
            int lastDigit = n % 10;
            decimal += lastDigit * (int)Math.pow(2,pow);
            pow++;
            n /= 10;
        }
        return decimal;
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binomial Number: ");
        int n=sc.nextInt();
        System.out.println("Decimal of " + n +" = " + BioToDec(n));
    }
    
}