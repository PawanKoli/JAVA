import java.util.*;

public class Number_Pyramid {
    public static void Pyramid(int row){
        for(int i=1;i<=row;i++){
            // Spaces
            for(int j=row-i;j>0;j--){   // for(int j=1;j<=row-i;j++)
                System.out.print("  ");
            }

            // Numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+"   ");
            }
            System.out.println();
        }
    }
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. Rows : ");
        int row =sc.nextInt();
        Pyramid(row);
    } 
}
