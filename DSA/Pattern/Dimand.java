import java.util.*;

public class Dimand {
    public static void dimand(int row){
        for(int i=1;i<=row;i++){
            // Spaces
            for(int j=1;j<=(row-i);j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            // Spaces
            for(int j=1;j<=(row-i);j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row=sc.nextInt();
        dimand(row);
    }
}
