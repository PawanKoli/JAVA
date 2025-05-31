import java.util.*;

public class Binary_Search {
    public static int Search(int num[],int key){
        int start=0,end=num.length-1;
        while(end>=start){
            int mid=(start+end)/2;
            // Comparisons
            if(num[mid]==key){  // Found
                return mid;
            }
            else if(num[mid]<key){   // Number is at Right
                start=mid+1;
            }
            else {
                end=mid-1;   // Nember is at Left
            }
        }
        return -1;
    }   

    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int num[]={12,65,264,267,346,796};  // Numers has to be in assending or decending orders
        System.out.print("Enter No. to Search : ");
        int key=sc.nextInt();
        System.out.println(key +" is at Index " + Search(num,key));
    }
}
