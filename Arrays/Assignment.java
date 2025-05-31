public class Assignment {
    // Question 1.
    public static void RepetNum(int num[]){
    boolean repet=false;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                    if(num[i]==num[j]){
                        repet=true;
                    }
                }
            }
            System.out.println(repet);
        } 
    

    public static void main(String arg[]){
        int num[]={1,1,1,3,3,4,3,2,4,2};
        RepetNum(num);
    }
}
