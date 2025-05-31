public class get_Ith_Bit {
    public static void main(String args[]){
        int n = 3;
        int i = 1;
        int bitMask = 1<<i;

        if((n & bitMask) == 0)
            System.out.println("0");
        else 
            System.out.println("1");
    }
}
