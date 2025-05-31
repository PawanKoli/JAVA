
import java.util.*;

public class KthLevel2nd {
    
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    
    public static void printKthLevel(Node root,int level, int k){
        if(root  == null)
            return;
        
        // doing it by preOrder
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        printKthLevel(root.left, level + 1, k);
        printKthLevel(root.right, level +1 , k);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(10);
        
        printKthLevel(root, 1 ,4);
    }    
}
