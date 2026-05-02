import java.util.*;

public class Solid_Rhombus{
    public static void Rhombus(int row){
        for(int i=1;i<=row;i++){
            // Spaces
            for(int k=1;k<=(row-i);k++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No. of Row : ");
        int row=sc.nextInt();
        Rhombus(row);
    }
}