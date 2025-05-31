public class Friends_Paring_Problem {

    public static int paring(int n){

        if(n==1 || n == 2)
            return n;
        
        //Choise for Single

        return paring(n-1) + (n-1) * paring(n-2);
        
    }
    public static void main(String[] args) {
        System.out.println(paring(3));
    }
}
