import java.util.*;

public class Factorial{

    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }

    public static int BioCoeff(int n,int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);

        int BioCoeff = fact_n/(fact_r * fact_nmr);

        return(BioCoeff);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values for Binomial Factorial:\n Enter n = ");
        int n=sc.nextInt();
        
        //System.out.println("  n! = "+fact(n));
        
        System.out.print(" Enter r = ");
        int r=sc.nextInt();

        System.out.println("Binomial of "+n+" C "+r+" = "+BioCoeff(n,r));

    }


}