import java.util.ArrayList;
import java.util.Collections;

public class Introduction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);  //time O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(2,30);
        System.out.println(list);

        //Get Operation
        System.out.println(list.get(2));  //time O(1)
        
        // Delete Operation 
        list.remove(0);  //time O(n)
        System.out.println(list);  

        //Set
        list.set(0, 10);  //time O(n)
        System.out.println(list);

        //Contains elememt
        System.out.println(list.contains(3));
        System.out.println(list.contains(13));

        System.out.println(list.size());

        //print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
        

        //print Reverse  time O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Maximum number  time O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size(); i++){
            //max = list.get(i) > max ? list.get(i) : max;
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);

        //Swaping indexes
        swap(list,1,3);
        System.out.println(list);


        //Sorting 
        Collections.sort(list);  //Ascending
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());  //Decending order
        System.out.println(list);
    }
    //Swap function
    public static void swap(ArrayList<Integer> list, int index1, int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);

    }
}