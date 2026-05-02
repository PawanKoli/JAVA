public class Calculate_Sum{
    public static int calSum(int n) {
        int sum;
        if(n==1)
            return 1;
        return sum = n + calSum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(calSum(n));
    
    }
}