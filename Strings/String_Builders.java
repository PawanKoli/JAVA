public class String_Builders {

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }// Its Time Complexivity is O(26)
         // But if we do this with String than its Time Complexivity will be (n^2) 
         // StringBuilder have all the functions that Sting has.
        System.out.println("All character are : "+sb);
        System.out.println("Length of String is : " + sb.length());
    }
}
