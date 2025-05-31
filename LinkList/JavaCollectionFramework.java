import java.util.LinkedList;  // JCF 
import java.util.ArrayList;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList();
        
        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

        ArrayList<Integer> array = new ArrayList<>();
        //array = 
    }    
}
