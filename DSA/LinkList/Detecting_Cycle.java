/*_______
    |___|
    ^
    slow/fast
 */

 /*_______
   |_____|
   ^
    slow/fast   // this is a coner case only above one is asked in the tests
 */


public  class Detecting_Cycle {

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

    public boolean isCycle(){  // FLOYD'S Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  // +1
            fast = fast.next.next; // +2

            if(slow == fast)
                return true; // cycle exits
        }
        return false; // cycle doesn't exists
    }

    public void removeCycle(){
        //Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }

        if(cycle == false)
            return;

        //find meeting point
        slow = head;
        Node prev = null; // last node  
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        
        //remove cycle -> last.next = null
         prev.next = null;
    }

    public void reverse(){
        if(head == null)
            return;

        Node prev = null;
        Node curr = head;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }System.out.println("null");
    }
    public static void main(String[] args) {
        Detecting_Cycle ll = new Detecting_Cycle();
        head = new Node(1);
        Node temp = new Node(2);
        head.next =temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = temp;
        System.out.println(ll.isCycle());
        ll.removeCycle();
        System.out.println(ll.isCycle());
        ll.print();
        ll.reverse();
        ll.print();
    }
}