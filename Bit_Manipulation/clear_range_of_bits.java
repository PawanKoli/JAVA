public class clear_range_of_bits {
    public static void main(String args[]){
        int num,a,b,bitMask,i,j;
        num=2515; i = 2; j = 7;

                a= ~0
                <<(j+1);
                b= (1<<i)-1;
        bitMask = a | b;
        System.out.println(num & bitMask);
    }
}
