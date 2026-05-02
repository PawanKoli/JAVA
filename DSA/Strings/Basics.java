import java.util.*;

public class Basics {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz@123");

    // Strings are IMMUTABLE(means strings can't be edited).

        Scanner sc = new Scanner(System.in);
        String name;
       // name = sc.next();   // next() is just for 1st word
        name = sc.nextLine(); // nextLine() is for line
        System.out.println(name);

        // Counting number of char (space also counts)
        System.out.println("Length = " + name.length());

        // Concatenate
        String firstName = "Pawan";
        String lastName = "Koli";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // Strings charAt Method
        System.out.println(fullName.charAt(0));
        printLetters(fullName);

    }
}
