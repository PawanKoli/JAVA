public class First_Occurence {
    public static int fistOccurence(int arr[],int key,int i){
        if(i==arr.length)
        return -1;
        if(arr[i]==key)
            return i;
        return fistOccurence(arr, key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
       System.out.println(fistOccurence(arr, 50, 0));
    }
}
