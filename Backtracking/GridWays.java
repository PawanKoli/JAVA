public class GridWays {

    public static int gridWays(int i , int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1)
            return 1;
        else if(i == n || j == m)
                return 0;
        // by this way its time complx is O(2^(n+m)) which is too much
        int w1 = gridWays(i,j+1,n,m);
        int w2 = gridWays(i+1,j,n,m);
        return w1+w2;
    }

    public static int fact(int num){  
        if(num == 1) return 1;
        return num*fact(num-1);
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println("Total ways are : " + gridWays(0,0,n,m));
        int ways = fact(n-1 + m-1)/(fact(n-1) + fact(m-1));  //by Permutation its time complx is O(n+m)
        System.out.println("Total ways are : " + ways);
    }
}
