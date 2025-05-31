//Delete N Nodes After M Nodes of a Linked List
//We have a linkedlist and two integers M and N.Traverse the linked list such that you retain M nodes then delete next Nnodes,continue the same till end of the linked list. 

//Difficulty Level : Rookie

public class PracticeQuestion2 {
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

    public void deleteNnodesAfterMnodes(int m, int n){
        Node curr = head;
        Node delete;

        while(curr != null){
            for(int count = 1;count < m && curr != null; count++)
                curr = curr.next;

            if(curr == null)
                return;

            delete = curr.next;
            for(int count = 1;count <= n && delete != null;count ++){
                //Node temp = delete;
                delete = delete.next;
            }

            curr.next = delete;
            curr = delete;
        }
    }

    public static void main(String[] args) {
        PracticeQuestion2 ll = new PracticeQuestion2();
         ll.addLast(1);
         ll.addLast(2);
         ll.addLast(3);
         ll.addLast(4);
         ll.addLast(5);
         ll.addLast(6);
         ll.addLast(7);
         ll.addLast(8);
         ll.addLast(9);
         ll.addLast(10);
         ll.addLast(11);
         ll.addLast(12);
         ll.addLast(13);
         ll.addLast(14);
         ll.addLast(15);
         ll.addLast(16);
         ll.addLast(17);
         ll.addLast(18);
         ll.addLast(19);
         ll.print(head);

         ll.deleteNnodesAfterMnodes(2, 3);
         ll.print(head);
    }

}
