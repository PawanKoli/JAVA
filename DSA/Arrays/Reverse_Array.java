import java.util.*;

public class Reverse_Array {
    public static void Reverse(int num[]){
    int start=0,end=num.length-1;
    // Swap
    while(end>start){
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
        start++;
        end--;
        }
    }   
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int num[]={3,5,2,36,34,64};
        Reverse(num);
        System.out.println("Reverse Array is : ");
        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i] + " ");
        }
    }
}
