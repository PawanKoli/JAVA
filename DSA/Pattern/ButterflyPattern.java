import java.util.*;

public class ButterflyPattern{

    public static void Butterfly(int row){
        for(int i=1;i<=row;i++){
            // Stars
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            // Spaces        She did like : for(int j=1;j<=2*(n-i);j++)
                for(int k=(row-i)*2;k>0;k--){
                        System.out.print("  ");
                    }
            // Stars        
                for(int l=1;l<=i;l++){
                        System.out.print("* "); 
                    }
                
                System.out.println();
        }

        for(int i=row;i>=1;i--){
            // Stars
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            // Spaces   She did like : for(int j=1;j<=2*(n-i);j++)
                for(int k=(row-i)*2;k>0;k--){
                        System.out.print("  ");
                    }
            // Stars
                for(int l=1;l<=i;l++){
                        System.out.print("* "); 
                    }
                
                System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row=sc.nextInt();
        Butterfly(row);
    }
}