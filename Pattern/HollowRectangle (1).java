import java.util.*;

public class HollowRectangle {

    public static void hollRec(int row, int col){
        for (int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || j==1 || i==row || j==col){  // condition for boundary cells
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of coloms : ");
        int col = sc.nextInt();
        hollRec(row,col);
    }
    
}
