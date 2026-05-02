import java.util.*;

public class Pairs_in_an_Arrary {
    public static void Pairs(int num[]){
        int total_pairs=0;
        for(int i=0;i<=num.length-1;i++){
            for(int j=i+1;j<=num.length-1;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                total_pairs++;      // or Formula for Total Pairs : n*(n-1)/2; 
            }
            System.out.println();
        }
        System.out.println("Total Pairs are : "+total_pairs);
    }   
    
    public static void main(String arg[]){
        int num[] = {2,4,6,8,10};
        Pairs(num);


    }
}
