public class Factorial {
    public static int fact(int n){
        int f;
        if(n==0){
            return 1;
        }
        return f=n * fact(n-1);
        
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    
}
