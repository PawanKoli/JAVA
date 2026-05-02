public class Practice_Queations {

    public static void Transposed_Matrix(int matrix[][]){
        int[][] Transposed = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[0].length;j++)
                Transposed[j][i] = matrix[i][j];


        System.out.print("\nTrasnposed Matrix is : \n");
        for(int i=0;i<Transposed.length;i++){
            for(int j=0;j<Transposed[0].length;j++)
                System.out.print(Transposed[i][j] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String arg[]){
        int matrix[][]= {{11,12,13},{21,22,23}};

        System.out.print("\nOriginal Matrix is : \n");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.print("\n");
        }
        Transposed_Matrix(matrix);
    }
}
