public class Merge_Sort {

    public static void MergeSort(int arr[],int startI,int endI){
        if(startI >= endI)
            return;
        
        //Kamm  --   Divide
        int mid = startI + (endI - startI)/2; // or (startIndex + endIndex)/2 but this may exedes the interter's capacity

        MergeSort(arr, startI, mid);// Left part Sort
        MergeSort(arr, mid +1, endI);// Right part Sort

        Merge(arr,startI, mid, endI);
    }
    
    //Merge the Sorted part
    public static void Merge(int arr[], int startI, int mid, int endI){
        int temp[] = new int[endI - startI +1];
        int i = startI ,j = mid +1, k=0;

        while(i <= mid && j <= endI){
            if(arr[i] < arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{ 
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        
        //for leftover elements for 1st sorted part
        while(i <= mid){
            temp[k++]=arr[i++];
        }
        
        //for leftover elements for 2nd sorted part
        while( j<= endI){
            temp[k++]=arr[j++];
        }
        

        //Copy temp TO Original
        for(i=startI, k=0; k<temp.length;i++,k++)
            arr[i] = temp[k];
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={3,9,6,5,2,8};
        MergeSort(arr ,0, arr.length-1);
        printArr(arr);

    }
}
