public class clear_Ith_Bit {
    public static void main(String args[]){
        int n =10,i=1,bitMask=~(1<<i);

        System.out.println(n & bitMask);
    }
}
