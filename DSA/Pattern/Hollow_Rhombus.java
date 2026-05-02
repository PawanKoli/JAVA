import java.util.*;

public class Hollow_Rhombus {
    public static void Rhombus(int row){
        for(int i=1;i<=row;i++){
            // Spaces
            for(int j=1;j<=(row-i);j++){
                System.out.print("  ");
            }
            // Stars
            for(int j=1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){  // boundary cells
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row =sc.nextInt();
        Rhombus(row);

    }
}
