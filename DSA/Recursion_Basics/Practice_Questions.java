public class Practice_Questions {

    // Ques 1: For a given integer array of size N.You have to find all the occurrences(indices)of a given element(Key) and print them. Use a recursive function to solve this problem.

    public static void allOccurance(int[] arr, int i,int key){
        if(i == arr.length){
            return;
         }
        if(arr[i]==key) 
            System.out.print(i + " ");
        allOccurance(arr, i+1, key);

    }

    //Ques 2: You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem.NOTE-The digits of the number will only bein the range 0-9 and the last digit of a number -can’t be 0.

    public static void convert_into_String(int n){
         String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        if(n==0) return;
        
        int lastDigit = n%10;
        convert_into_String(n/10);
        System.out.print(digits[lastDigit] + " ");
    }

    // Ques 3: Write a program to find Length of a String using Recursion

    //public static int length_of_String(String str){
    //  }
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        allOccurance(arr, 0, 2);
        System.out.println();
        convert_into_String(1234);
    }   
} 