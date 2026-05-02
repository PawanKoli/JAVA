public class Remove_Duplicates_In_A_String {

    public static void remove_Duplicates(String str,int index,StringBuilder newString,boolean map[]){

        if(index==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar - 'a'] == true){
            //duplicate
            remove_Duplicates(str, index+1, newString, map);
        }
        else
        {
            map[currChar - 'a'] = true;
            remove_Duplicates(str, index+1, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = new String("appnacollege");
        remove_Duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
