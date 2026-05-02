import java.util.LinkedList;
import java.util.*;

public class LL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }    

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        size++;
        //step 1 create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
           }
        //step 2 newNode next -> head
        newNode.next = head; // linking
        
        //step 3 head -> newNode
        head = newNode; 
    }

    public void addLast(int data){
        size++;
        // Step 1 create new node
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2  nextNode -> tail
        tail.next = newNode;

        // Step 3 tail -> newNode
         tail = newNode;
        }

    public void add(int idx, int data){
        if(idx == 0){
             addFirst(data);
             return;
        }
        if( idx == size -1){
            addLast(data);
             return;
        }
             
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < idx-1){    // i = idx-1; temp -> prev
            temp = temp.next;
            i++;
         }
        newNode.next = temp.next;
        temp.next = newNode;
        }

    public void removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return;
        }

        if(size == 1){
            head = tail = null;
            size--;
        }
        head = head.next;
        size--;
    }
    
    public void removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return;
        }
    
        if(size == 1){
            head = tail = null;
            size--;
        }
        
        Node prev = head;
        for(int i=0;i < size - 2;i++){
            prev = prev.next;
        }   
        prev.next = null;
        tail = prev;
        size--;
    }

    public void remove(int idx){
        if(idx == 0){
            removeFirst();
            return;
        }

        if(idx == size -1){
            removeLast();
            return;
        }

        Node prev = head;
        for(int i=0; i < idx -1; i++){
            prev=prev.next;
        }
        Node temp = prev.next;
        prev.next = temp.next;
        size--;
    }

    public int itrSearch(int key){  //O(n)
        Node temp = head;
        int i =0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public int helper(Node head, int key){  // O(n)
        if(head == null)
            return -1;

        if(head.data == key)
            return 0;

        int idx = helper(head.next, key);
        if(idx == -1)
            return -1;

        return idx +1;
    }

    public void reverse(){ //O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void removeNthFromEnd(int n){
        int siz = 0;
        Node temp = head;
         while(temp != null){
            siz++;
            temp = temp.next;
         }

         if(n == siz){
            head = head.next;
            return;
         }

        int idx = siz - n;
        int i=1;
        Node prev = head;
        while(i < idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        size--;
    }

    //Slow Fast Approach
    public Node findMid(Node head){  // helper
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow;  // slow is mid
    }

    public boolean checkPalindron(){
        if(head == null || head.next == null){
            return true;
        }

        // Step 1 find mid
        Node midNode = findMid(head);

        //Step 2 reverse 2nd half
         Node prev = null;
         Node curr = midNode;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        
        Node right = prev;
        Node left = head;

        // check if equal
        while(right != null){
            if(left.data != right.data)
                return false;

            left = left.next;
            right = right.next;
        }
        
        return true;
    }
        
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
             return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        }

    public static void main(String[] args) {
        LL ll = new LL();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(2);
        ll.print();
        ll.addLast(1);
        ll.print();
        ll.add(2, 3);
        ll.print();
        System.out.println("Size : " + ll.size);
        ll.add(0, 0);
        ll.print();
        System.out.println("Size : " + ll.size);
        ll.add(6, 0);
        ll.print();
        
        System.out.println(ll.checkPalindron());
        ll.print();
    }
}