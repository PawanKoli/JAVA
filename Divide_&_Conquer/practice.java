class practice{
    
    public static void findOccurrence(int arr[],int key,int si,int ei){
        if(si>ei) return ;
        if(arr[si] == key) System.out.print(si + " ");
        findOccurrence(arr,2,++si,ei);
    }
    
    public static void numToString(int num,int i){
        if(num % 10 == 0){
            System.out.println("Enter the number that doesn't have zero at the end");
            return;
        }
        
        String numArr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
    }
    public static void main(String args[]){
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        findOccurrence(arr,2,0,arr.length-1);
        
        int num = 2019;
        numToString(num,0);
    }
}