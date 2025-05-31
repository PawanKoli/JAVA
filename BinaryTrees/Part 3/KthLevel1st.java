import java.util.*;


public class KthLevel1st {
    
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
    
    
    public static void printKthLevel(Node root,int k){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 1;
        
        while(!q.isEmpty()){
            Node curr = q.remove();
            
            if(curr == null){
                if(q.isEmpty())
                    break;
                else{
                    q.add(null);
                    level++;
                }
            }else{
                if(level == k)
                    System.out.print(curr.data + " ");
                    
                if(curr.left != null){
                    q.add(curr.left);
                }
                
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
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
        
        printKthLevel(root, 8);
    }
}
