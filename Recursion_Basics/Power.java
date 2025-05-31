public class Power {
    public static int power(int x,int n){  //O(n)
        if(n==1)
            return x;
        return x * power(x,n-1);
    }

    public static int optimizedPower( int x, int n){   //O(logn)
        if(n==0)
            return 1;
        
        int  half = optimizedPower(x, n/2);
        int  halfPower = half * half;
        
        if(n%2 !=0) halfPower *= x;
        return halfPower;
    }
    public static void main(String[] args) {
        System.out.println(power(2,20));
        System.out.println(optimizedPower(2,25));
    }
    
}
