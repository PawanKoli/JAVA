import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) { //O(n)
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1; i>=0; i--){
            //while
            while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
                s.pop();
            }

            //if-else
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }

            //push in s
            s.push(i);
        }

        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i] + " ");
        }System.out.println();

        //next Greater left
        //next Greater right
        //next Smaller left
        //next Smaller right
    }
}
