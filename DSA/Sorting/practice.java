import javax.swing.SortOrder; 

class practice{

    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){  
            int curr=arr[i];
            int prev=i-1;
           // int temp;
              //while(prev>=0 && arr[prev]>curr){
            while(prev>=0 &&curr<arr[prev]){
                //temp=arr[curr];
                arr[prev+1]=arr[prev];
                prev--;
            } 
            arr[prev+1] = curr;
        }
    
    
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " " );
        }
        System.out.println(); 
    }
    public static void main(String args[]) { 
        int arr[]= {5,4,3,1,2};
        sort(arr);
        print(arr);
    }
} 