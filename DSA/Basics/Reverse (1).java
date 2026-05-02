import java.util.*;

public class Reverse{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the No. to Reverse: ");
        int n = sc.nextInt();

        while(n>0){
            int x=n%10; //for getting last number
            System.out.print(x+ " ");
            n=n/10; //for remoivng last number 
        }
        System.out.println();
    }



} 