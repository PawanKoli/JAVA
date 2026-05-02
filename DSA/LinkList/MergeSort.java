//import java.util.LinkedList;

public class MergeSort{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public  Node head;
    public  Node tail;
    
    public void print(){
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

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        return;
    }
    
    public Node getMid(Node head){
        if(head == null){
            return head;
        }
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; //mid Node
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(0);
        Node temp = mergedLL;
        tail = temp;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            tail = temp;
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
            }
            tail = temp;
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
            }
            tail = temp;

        return mergedLL.next;
    }

    public Node mergeSort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
          }
        //find mid
        Node mid = getMid(head);

        // left and right Merge Sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead); 

        // merge
        return merge(newLeft,newRight);
    }   


    public static void main(String[] args) {
        MergeSort ll = new MergeSort();
        //Node newNode = new Node(5);
        //head = newNode;
        ll.addLast(5);
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(3);
        ll. print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
        //Node temp1 = ll.getMid(head);
        //System.out.println(temp1.data);
    }
}