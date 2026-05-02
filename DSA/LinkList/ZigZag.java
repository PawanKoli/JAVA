public class ZigZag {

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
    
    
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
    
    public void print(Node head){
        if(head == null){
            System.out.println("null");
            return;    
        }
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public Node getMid(Node head){
        if(head == null || head.next == null){
            return head;
        }
        
        Node slow = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public Node zigZag(){
        //Find MID
        Node mid = getMid(head);

        //REVERSE 2nd Half 
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        Node nextL, nextR;
        
        //ALTERNATE Merge - Zig-Zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;

            nextR = right.next;
            right.next = nextL;

            //update
            left = nextL;
            right = nextR;
        }

        return head;
    }
    public static void main(String[] args) {
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //ll.addLast(6);
        ll.print(head);
        Node mid = ll.getMid(head);
        System.out.println(mid.data);
        ll.print(ll.zigZag());
        ll.print(head);
        
    }

}
