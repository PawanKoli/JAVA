public class Odd_Even {
    public static void main(String args[]){
        int num=2347;
        int bitMask=1;
        if((num & bitMask)==1){
            System.out.println(num + " is Odd");
        }
        else System.out.println(num + " is Even");

   }
    
}
