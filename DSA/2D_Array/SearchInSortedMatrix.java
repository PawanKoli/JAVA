import javax.lang.model.util.ElementScanner14;

public class SearchInSortedMatrix {

//From Top Left to Bottom Right
    public static boolean Search(int matrix[][],int key){
        int n=matrix.length, m=matrix[0].length;
        int i=0,j=m-1;

        while(j>=0 && i<n){
            if(matrix[i][j] == key){
                System.out.println("\n" + key +" found at : (" + i + "," + j +")");
                return true;
            }
            else if(matrix[i][j] > key)
                    j--;
                else if(matrix[i][j] < key)
                    i++;
            
        }
        System.out.println("\n" + key + " not Found");
        return false;
    }


//From Bottom Left to Top Right
    /*public static boolean Search(int matrix[][],int key){
        int n=matrix.length, m=matrix[0].length;
        int j=0,i=n-1;

        while(i>=0 && j<m){
            if(matrix[i][j] == key){
                System.out.println("\n" + key +" found at : (" + i + "," + j +")");
                return true;
            }
            else if(matrix[i][j] < key)
                    j++;
                else if(matrix[i][j] > key)
                    i--;
            
        }
        System.out.println("\n" + key + " not Found");
        return false;
    }*/

    public static void main(String arg[]){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key=33;
        Search(matrix,key);
    }
}
