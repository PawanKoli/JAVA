import java.util.*;

public class Palindromic_Pattern_With_Numbers {
    public static void Pattern(int row){
        for(int i=1;i<=row;i++){
            // Spces
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            // Decending Numbers
            for(int j=i;j>=1;j--){
                System.out.print(j +" ");
            }
            // Ascending Numbers
            for(int j=2;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row = sc.nextInt();
        Pattern(row);
    }
}