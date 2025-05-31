import java.util.*;

public class PrefixProblem {
    static class Node {
        Node children[] = new Node[26]; // 'a' - 'z'
        boolean eow = false;
        int freq = 0;

        public Node() {
            for(int i=0; i<children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }else
                curr.children[idx].freq++;

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean prefix(String key) {
        Node curr = root;
        StringBuilder pre = new StringBuilder();
        
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            pre.append(key.charAt(level));

            if(curr.children[idx] == null){
                System.out.println(" -1");
                return false;
            }
            else if(curr.children[idx].freq == 1) {
                System.out.println(pre);
                return true;
            }
            curr = curr.children[idx];
        }

        return curr.eow;
    }

    
    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for(int i=0; i<arr.length; i++) {
            insert(arr[i]);
        }

        // prefix("iogn");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " = ");
            prefix(arr[i]);
            System.out.println();
        }
    }
}
