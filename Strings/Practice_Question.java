import java.util.*;
public class Practice_Question{ 

    //Ques-1 : Count many times lowecase vowels occurred in a String
    public static int count_Vowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println("Enter the String : ");
        String str = new Scanner(System.in).next();
        System.out.println("Occurence of voweles are : "+count_Vowels(str));
    }
}