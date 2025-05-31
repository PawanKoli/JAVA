import java.util.*;

public class AuxlaaryArrays {
    //TRAPPING RAIN WATER

    public static void Array(int arr[]){
       
        int maxleft[]=new int[arr.length];
        for(int i=1;i<arr.length;i++){
            maxleft[0]=arr[0];
            maxleft[i]=Math.max(maxleft[i-1],arr[i]);
        }

        int maxright[]=new int[arr.length];
        for(int i=arr.length-2;i>=0;i--){
            maxright[arr.length-1]=arr[arr.length-1];
            maxright[i]=Math.max(maxright[i+1],arr[i]);
        }

        int minboth[]=new int[arr.length],waterlevel=0;
        for(int i=0;i<arr.length;i++){
            minboth[i]=Math.min(maxleft[i],maxright[i]);

            waterlevel += minboth[i]-arr[i];

        }

        System.out.println("Total water accumalated = "+ waterlevel);
    }
    

public static void main(String arg[]){
        int arr[]={4,2,0,6,3,2,5};
        Array(arr);
    }
}