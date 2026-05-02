import java.util.*;

public class TransformSumTree {

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

    public static int transform(Node root){
        if(root == null)
            return 0;

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        int myData = root.data;
        
        root.data = newLeft + leftChild + newRight + rightChild;

        return myData;
    }

    public static void preOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node node){
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }


    public static void main(String[] args){
    
        //                  1
        //               /      \
        //              2        3
        //            /   \     /  \
        //           4     5    6   7
        //          /       \  /     \
        //         8        9 11      10     

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left = new Node(6);
        root.right.left.left = new Node(11);

        root.right.right = new Node(7);
        root.right.right.right = new Node(10);

        //transform(root);
        preOrder(root);   
        System.out.println();
        inOrder(root);
    }

}
