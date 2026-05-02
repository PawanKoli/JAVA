public class update_Ith_bit {

    // public static int clear_Ith_Bit(int num,int i){
    //     int bitMask=~(1<<i);
    //     //num = num & bitMask;
    //     return num;
    // }

    public static int update(int num,int i,int newBit){
        //num = clear_Ith_Bit(num,i);
        num = num & ~(1<<i);
        int bitMask=newBit<<i;
        return num | bitMask;
    }
    public static void main(String args[]){
        System.out.println(update(7,2,0));
    }
}
