public class Tiling_Problem {

    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1) return 1;
        // Vertical Choice (n-1) && Horizontal Choice (n-2)

        return tilingProblem(n-1) + tilingProblem(n-2);


    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    
}
