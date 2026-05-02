import java.util.*;

public class Floyds_Triangle {
    public static void FloydTri(int row){
        int counter=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(counter<10){
                    System.out.print(" " + counter + " ");
                }
                else System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }    

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row =sc.nextInt();
        FloydTri(row);
    }
}