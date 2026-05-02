import java.util.*;

public class LargestAndMinNumber {
    public static int getMinAndLargest(int num[]){
        int largest=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(min>num[i]){
                min=num[i];
            }
            
            if (largest<num[i]){
                largest=num[i];
            }
        }
        System.out.println("Minimum No. is : " + min);
        return largest;
    }    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int num[]={18,54,75,3,710,87,3};
        System.out.println("Largest No. is : "+getMinAndLargest(num));
    }
}
