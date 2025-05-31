import java.util.*;

public class CompareStrings {
    public static void main(String args[]){
        String name1="Tony";
        String name2="Tony";
        String name3= new String("Tony");


        // This is how to Compare the values in the Strings
        if(name1.equals(name3))
            System.out.println("They are same Strings");
        else
            System.out.println("They are different Strings");


        //DO NOT USE == to check for string equality
       //Gives incorrect answer here

       if(name1 == name3)
            System.out.println("They are same Strings");
        else 
            System.out.println("They are different Strings");
        
        //Gives correct answer here 
        if(name1 == name2)
            System.out.println("They are same Strings");
        else
            System.out.println("They are different Strings");

    }
    
}
