
// Also called PIVOT & PARTITION

//Worst case occurs when pivot is alwavs the smallest or the largest element.

public class Quick_Sort {
    public static void quickSort(int arr[],int startIndex,int endIndex){
        if(startIndex>=endIndex)
            return;

        //pivot variable stores correct idx for pivot element
        int pIndex=partition(arr,startIndex,endIndex);
        quickSort(arr, startIndex, pIndex-1); 
        quickSort(arr, pIndex+1, endIndex);
    }

    public static int partition(int arr[],int startIndex,int endIndex){
        int pivot = arr[endIndex];
        int i = startIndex-1;  // makes space for elements smaller than pivot
        
        for(int j=startIndex; j<endIndex; j++){
            if(arr[j] < pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        
        //place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[endIndex] = temp; //pivot's position need to change so (pivot = temp) won't work

        return i;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8,1};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
