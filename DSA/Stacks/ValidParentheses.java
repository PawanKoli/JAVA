import java.util.*;

public class ValidParentheses{

    public static boolean isValid(String str){
        Stack<Character> s = new java.util.Stack(); 
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){ // opening
                s.push(ch);
                System.out.print(ch);
            }
            else{
                //closing
                if(s.isEmpty())
                    return false;

                if((s.peek() == '(' && ch ==')') // ()
                    || (s.peek() == '{' && ch =='}') // {}
                    || (s.peek() == '[' && ch ==']')){ //[]

                        s.pop();
                        System.out.print(ch);
                }else{
                    return false;
                }
            }
        }

        if(!s.isEmpty()){
            return false;
        }else
            return true;

    }
    public static void main(String args[]) {
        String str = "(({})[]("; //true

        System.out.println("\n" + isValid(str));
    }
}
