public class SortedRotatedArray {

    public static int sortedAndRotated(int arr[], int target, int si, int ei){
        if(si > ei) return -1;
        int mid = si+(ei-si)/2;
        if(arr[mid] == target) return mid;
        
        //case 1 : if mid lies on line 1
        if(arr[si] <= arr[mid]){
            // Left
            if(arr[si] <= target && target <= arr[mid])
                return sortedAndRotated(arr, target, si, mid-1);
            // Right
            else return sortedAndRotated(arr, target, mid+1, ei);
            }
        //case 2 : mid lies on line 2
        //if(arr[mid] => arr[ei])
        else{
            //Right
            if(arr[mid] <= target && target <= arr[ei])
                return sortedAndRotated(arr, target, mid+1,ei);
            //Left
            else return sortedAndRotated(arr, target, si, mid-1);
        }
        
    }

    public static int byIteration(int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        
        if(si>ei) return -1;
        while (si < ei){
            int mid = si + (ei-si)/2;
            if(arr[mid] == target) return mid;
            
            //On line 1
            if(arr[si] <= arr[mid]){
                if(arr[si] <= target && target <= arr[mid])
                // left side
                    ei =mid-1;
                else // right side
                    si =mid +1;
            } 
            
            // on line 2    
            else {// right side
                    if(arr[mid] <= target && target <= arr[ei]) 
                        si = mid +1;
                else // left side
                    ei = mid-1;
                }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {4,5,0,1,2,3};
        System.out.println("By recursion Target is at : " + sortedAndRotated(arr, 0, 0, arr.length-1));
        System.out.println("By Iteration Target is at : " + byIteration( arr, 0));
    }
    
}