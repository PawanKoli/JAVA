public class isPowerOf_2 {

    public static boolean power(int n){
        return (n & (n-1)) == 0;
    }
    
    public static void main(String arg[]){
        System.out.println(power(16));
    }
    
}
