//Swapping Nodes in a Linked List
//We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be swapped by changing links.Swapping data of nodes may be expensive in many situations when data contains many fields. It may be assumed that all keys in the linked list are distinct.

import java.util.LinkedList;


public class PracticeQuestion3 {

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

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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
    public void swapNode(int x, int y){
    if(x == y || head == null){
        return;
    }

    // if(x > y){
    //     swapNode(y, x);
    //     return;
    // }

    Node prevX = null, currX = head;
    while(currX != null && currX.data != x){
        prevX = currX;
        currX = currX.next;
    }

    Node prevY = null, currY = head;
    while(currY != null &&  currY.data != y){
        prevY = currY;
        currY = currY.next;
    }
    
    if(currX == null || currY == null)
        return;

    if(prevX != null){
        prevX.next = currY;
    }
    else
        head = currY;

    if(currY != null)
        prevY.next  = currX;
    else 
        head =  currX;

    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;
    }
    public static void main(String[] args) {
        //LinkedList<Integer> ll = new LinkedList();
        PracticeQuestion3 newll = new PracticeQuestion3();

        newll.addFirst(5); 
        newll.addFirst(4); 
        newll.addFirst(3); 
        newll.addFirst(2); 
        newll.addFirst(1);
        newll.print(head);
        newll.swapNode(4,1);
        newll.print(head);
        // int data = ll.peek();
        // System.out.println(data);
        // System.out.println(ll.lastIndexOf(39));
        // //Node newNode = new Node(0);
        // //newNode = ll.getClass()
        // head = Object ll;
        // System.out.println(ll.clone());
    }
}