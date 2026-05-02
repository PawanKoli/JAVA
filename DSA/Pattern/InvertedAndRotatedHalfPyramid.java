import java.util.*;

public class InvertedAndRotatedHalfPyramid{
    
    public static void InverPyr(int row){
        for(int i=1;i<=row;i++){
                    for(int j=1;j<=row-i;j++){
                        System.out.print("  ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");      
                    }
            System.out.println();
        }
    }  
    
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NO. of Rows : ");
        int row=sc.nextInt();
        InverPyr(row);
    }

}