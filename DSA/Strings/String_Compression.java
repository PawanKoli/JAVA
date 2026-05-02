public class String_Compression {
    public static String Compression(String str){
        StringBuilder newStr = new StringBuilder ("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){  count++;
                i++;
            }
            newStr.append(str.charAt(i));
            newStr.append(count >1 ? count :"");
        }
        return newStr.toString();
    }

    public static void main(String args[]){
        String str = "aaabbccdd";
        System.out.println(Compression(str));
    }

    
}
