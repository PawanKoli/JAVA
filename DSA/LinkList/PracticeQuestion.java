//Intersection of Two Linked Lists
//In a system there are two singly linkedl ist. By some programming error,the end node of one of the linked lists got linked to the second list,forming an inverted Y-shaped list. Write a program to get  the point where two linked lists merge

public class PracticeQuestion {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head1;
    public static Node head2;
    public static Node tail;

    public void print(Node head){
        if( head == null){
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

    public Node detectIntersectionNode(Node head1, Node head2){
        if( head1 == null || head2 == null){
            return null;
        }

        Node temp2 = head2;
        
        while(temp2 != null){
            Node temp1 = head1;

            while(temp1 != null){
                if(temp1 == temp2){
                    return temp1;
                }
                temp1 =  temp1.next;
            }
            temp2 = temp2.next;
        }
        return null;
    }
    public static void main(String[] args){
        PracticeQuestion ll = new PracticeQuestion();

        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node newNode = new Node(6);
        head1.next.next.next = newNode;

        newNode.next = new Node(7);

        head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = newNode;
        
        ll.print(head1);
        ll.print(head2);

        Node intersectionPoint = ll.detectIntersectionNode(head1, head2);

        if(intersectionPoint == null){
            System.out.println("No Intersection Point");
        }
        else
            System.out.println("Intersection Point : " + intersectionPoint.data);

    }
}
