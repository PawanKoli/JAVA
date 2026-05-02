public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void print(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void printPrev(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node temp = tail;

        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode; 
    }

    public void removeFirst(){
        if(head == tail || head == null){
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void removeLast(){
        if(tail == head || tail == null){
            tail = head = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
    
    public void reverse(){
        if(head == null || head == tail){
            return;
        }

        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
        }
        tail = head;
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.print();
        dll.printPrev();

        // dll.removeFirst();
        // dll.print();
        // dll.printPrev();

        // dll.removeLast();
        // dll.print();
        // dll.printPrev();
        
        dll.reverse();
        dll.print();
        dll.printPrev();
    }
}