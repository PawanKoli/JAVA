import java.util.*;
public class Print_Subarray{

    //  Brute Froce
    public static void Subarray1(int num[]){
        int ts=0,max=Integer.MIN_VALUE;
        for(int i=0;i<=num.length-1;i++){
            int start=i;
             for(int j=i;j<=num.length-1;j++){
                int end =j;
                int sum=0;
                System.out.print("{ ");
                for(int k=start;k<=end;k++){         // Print Subarray
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                }
                System.out.print("} ");
                System.out.println("Sum = "+sum);
                if(sum>max){ 
                    max=sum;
                }
                ts++;   // or Formula for No. of Subarrarys : n* (n+1)/2;
            }
            System.out.println();
        }
        System.out.println("Total Subarrays : "+ts);
        System.out.println("Max Subarray Sum : "+max);
    }

    //  Optimization 1 : Perfix Sum Array
    public static void Subarray2(int num[]){
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        // This is for Prefix Sum of Array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }

        // And this is for Max Sum
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                int sum=0;
                sum = i==0 ? prefix[end] : prefix[end]-prefix[start-1];
                max = Math.max(sum,max);
            }
        }
        System.out.println("Max Subarray Sum = "+max);
    }

    public static void Kadanes(int num[]){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        System.out.println("Max Subarray sum = " + max);
    }

    public static void main(String arg[]){
        int num[]={-2,3,6,-4,10};
        Subarray1(num);
        Subarray2(num);
        Kadanes(num);
    }
}