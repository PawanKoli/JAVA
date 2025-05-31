import java.util.*;

public class Inverted_Half_Pyramid_With_Numbers{

    public static void InvNum(int row){
            for(int j=row;j>0;j--){
                for(int x=1;x<=j;x++){
                    System.out.print(" " + x);
                }
                System.out.println();
            }
    }

    public static void main(String arg[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row=sc.nextInt();
        InvNum(row);
    }
}