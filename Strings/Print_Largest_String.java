public class Print_Largest_String {
    
    public static void main(String arg[]){
        String arr[] = {"apple","Apple", "Mango","mango", "banana"};
        
        String largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i].compareToIgnoreCase(largest)>0)   // or use compareTo for not case sensetive
            //str1.compareTo(str2) will be 0 if str1 == str2
            //str1.compareTo(str2) will be -ve if str1 < str2
            //str1.compareTo(str2) will be +ve if str1 > str2
            largest=arr[i];
        }
        System.out.println(largest);
    }   
}
