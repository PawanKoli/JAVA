import java.util.*;

public class ImplementQueueUsingDeque {
    static class Queue{
        Deque<Integer> deque = new LinkedList<>();

        boolean isEmpty(){
            return deque.isEmpty();
        }

        void add(int data){
            deque.addLast(data);
        }
        
        int remove(){
            return deque.removeFirst();
        }

        int peek(){
            return deque.getFirst();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
