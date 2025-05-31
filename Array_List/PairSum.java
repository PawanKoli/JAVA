import java.util.ArrayList;

public class PairSum {

    public static boolean findSum1(ArrayList <Integer> list, int target){
        
        //brut force approach
        // for(int i=0; i<list.size(); i++){
        //     for(int j= i+1; j<list.size(); j++){
        //         if(list.get(i) + list.get(j) == target){
        //             System.out.println( i + "  " + j);
        //             return true;
        //         }

        //     }
        // }

        //2 Pointers approach for Sorted Arrays
        int lp = 0, rp = list.size()-1;
        
        while (lp < rp) {
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(lp + "  " + rp);
                return true;
            }
            else 
                if(list.get(lp) + list.get(rp) > target)
                    rp--;
                else
                    lp++;
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int breakingPoint = -1;

        for(int i=0; i<list.size();i++){
            if(list.get(i) > list.get(i+1)){
                breakingPoint = i;
                break;
            }
        }

        int lp = breakingPoint +1;  //smallest
        int rp = breakingPoint; //largest

        while(lp !=  rp){
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                System.out.println(lp + " " + rp);
                return true;
            }
            //case 2
            if(list.get(lp) + list.get(rp) > target)
                    rp = (n + rp-1)% n;
            // case 3   
            else
                    lp = (lp+1)% n;
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;

        ArrayList<Integer> listRotated = new ArrayList<>();
        //11,15,6,8,9,10 - Sorted and Rotated
        listRotated.add(11);
        listRotated.add(15);
        listRotated.add(6);
        listRotated.add(8);
        listRotated.add(9);
        listRotated.add(10);
        int target2= 16;

        System.out.println(findSum1(list, target));
        System.out.println(pairSum2(listRotated, target2));
    }   
}
