import java.util.*;

public class BinaryTreesB {
    
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
    
    static class BinayTree{
        static int idx = -1;
        
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1)
                return null;
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
        
        // Preorder Traversal : root -> left subtree -> right subtree
        public static void preOrder(Node root){  // O(n)
            if(root == null){
                System.out.print("-1, ");
                return;
            }
            System.out.print(root.data + ", ");
            preOrder(root.left);
            preOrder(root.right);
        }

        //Inorder Traveral : Left Subtree -> Root -> Right Subtree
        public static void inOrfer(Node root){ // O(n)
            if(root == null){
              // System.out.print("-1, ");
                return;
            }

            inOrfer(root.left);
            System.out.print(root.data + ", ");
            inOrfer(root.right);
        }
        
        //PostOrder Traversal : Left Subtree -> Right Subtree -> Root
        public static void postOrder(Node root){ // O(n)
            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.err.print(root.data+ " ");
        }

        //Level Order Traversal
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            
            while(!q.isEmpty()){
                Node curr = q.remove();

                if(curr == null){
                    System.out.println();
                    if(q.isEmpty())
                        break;
                    else
                        q.add(null);
                }else{
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null)
                        q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 

        BinayTree tree = new BinayTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // System.out.println(root.right.right.data);

        tree.preOrder(root);
        System.out.println();
        tree.inOrfer(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelOrder(root);
    }
}
