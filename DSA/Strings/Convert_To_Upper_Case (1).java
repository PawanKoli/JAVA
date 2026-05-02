public class Convert_To_Upper_Case {
  
    public static String Convert(String str){
        StringBuilder newStr = new StringBuilder("");
        newStr.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i != str.length()-1){
                newStr.append(str.charAt(i)); // To add ' '
                i++;
                newStr.append(Character.toUpperCase(str.charAt(i)));
            }
            else newStr.append(str.charAt(i));
        }
        return newStr.toString();  // We have to convert StringBuilder to String
    }
    public static void main(String args[]){
        String str = "hello there world";
        System.out.println(Convert(str));
    }
    
}
