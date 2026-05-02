import java.util.*;

import java.util.ArrayList;

public class ReverseStack {

    public static void reverseStack(ReverseStack s){
        if(s.isEmpty())
            return;

        int top = s.pop();
        reverseStack(s);
        s.pushAtBottom(top);
    }

    static ArrayList<Integer>  list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size() == 0;
    }
    
    public static void pushAtBottom(int data){
        list.add(0,data);
    }

    public static void push(int data){
        list.add(data);
    }

    public static int peek(){
        return list.get(list.size() - 1);
    }

    public static int pop(){
        int top = list.get(list.size() -1);
        list.remove(list.size() -1);
        return top;
    }
    public static void main(String[] args) {
        ReverseStack s = new ReverseStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}
