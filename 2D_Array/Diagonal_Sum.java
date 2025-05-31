// Only works for square matrixs
public class Diagonal_Sum{
    public static int Diagonal(int matrix[][]){
        int sum=0;

        // for(int i=0;i<=matrix.length-1;i++){
        //     for(int j=0;j<=matrix.length-1;j++){
        //         if(i==j) // for Primary Diagonal
        //             sum+=matrix[i][j];
        //         else if(i+j== matrix.length-1)  //for Secondary Diagonal
        //             sum+=matrix[i][j];    
        //     }
        // }
        // return sum;


        // MORE OPTIMIZE
        for(int i=0;i<=matrix.length-1;i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String arg[]){
        int matrix[][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};

        System.out.println(Diagonal(matrix));
    }
}