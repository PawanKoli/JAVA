import java.util.*;

public class MinimumDistanceBetweenTwoNodes {

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

    public static Node lca2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return  root;
        }
        
        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        //left LCA = valid but right LCA = null
        if(rightLca == null)
            return leftLca;
        //right LCA = valid but left LCA = null
        if(leftLca == null)
            return rightLca;

        return root; // right & left != null
    }

    public static int lcaDist(Node root, int n){
        if(root == null)
            return -1;

        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1)
            return -1;
        else if(rightDist == -1)
                return leftDist +1;
            else if(leftDist ==-1)
                    return rightDist +1;
        return -1;
    }
    public static int MinDistance(Node root, int n1, int n2){
        
        Node node = lca2(root, n1, n2);
        int dist1 = lcaDist(node, n1);
        int dist2 = lcaDist(node, n2);
        return dist1 + dist2;
    }
    
    public static void main(String[] args) {
    //                  1
    //               /     \
    //              2       3
    //            /   \    /  \
    //           4     5  6    7
    //          /       \       \
    //         8         9       10     

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);
        root.left.right.right = new Node(9);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(10);

        int n1 = 4, n2 = 6;
        
       System.out.println("Min. Distance : " + MinDistance(root,n1,n2));
    }


}
