import java.util.*;

public class Zero_One_Triangle {
    public static void Tri(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else System.out.print(0 + " ");
            }
            System.out.println();

        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No. of Rows : ");
        int row=sc.nextInt();
        Tri(row);
    }
}
