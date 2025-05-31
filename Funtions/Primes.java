public class Primes {

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimesinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String arg[]){
        //System.out.println(isPrime(53));
        PrimesinRange(100);
    }
    
}

