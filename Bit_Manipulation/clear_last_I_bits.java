public class clear_last_I_bits {
    
    public static int clear(int num,int i){
    int bitMask = ~0<<i;  // or -1 = ~0
    return num & bitMask;
    }
    public static void main(String args[]){

        System.out.println(clear(15,2));
    }
}
