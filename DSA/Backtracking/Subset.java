public class Subset {
    public static void findSubset(String str,int i, String ans){
        // base case
        if(i == str.length()){
            if(ans.length() == 0)
                System.out.println("null");
            else
                System.out.println(ans);
            return;
        }

        //Yes choise
        findSubset(str, i+1, ans+str.charAt(i));
        //No chosie
        findSubset(str, i+1, ans);  //backtracking 
    }
    public static void main(String args[]){
        String str = "abc";
        findSubset(str,0,"");
    }
}
