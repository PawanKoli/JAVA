import java.util.*;

public class MirrorBST {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            root.left = insert(root.left, val);
        }else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }   

    public static Node mirror(Node root){
        if(root == null)
            return null;
        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
    
    public static void print(Node root){
        if(root == null)
            return;
        System.out.print(root.data +" ");
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

        inOrder(root);
        System.out.println();
        print(root);
        System.out.println();
        mirror(root);
        print(root);
    }        
    
}
