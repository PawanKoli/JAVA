import java.util.*;

public class ImplementStackUsingDeque {
    public static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        
        boolean isEmpty(){
            return deque.isEmpty();
        }

        void push(int data){
            deque.addLast(data);
        }

        int pop(){
            return deque.removeLast();
        }

        int peek(){
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
