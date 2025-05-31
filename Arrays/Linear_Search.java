import java.util.*;

public class Linear_Search {

    public static int Search(int marks[],int n){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int marks[]={1,4,7,91,10,66};
        System.out.print("Numbers are : ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. to Search : ");
        int n= sc.nextInt();
        int index = Search(marks,n);
        if(index== -1){
            System.out.println(n + " NOT FOUND ");
        }
         else   System.out.println(n +" is at Index : " + index);
        
    }
}
