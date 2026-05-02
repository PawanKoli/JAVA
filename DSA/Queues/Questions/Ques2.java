//Connect n ropes with minimum cost
import java.util.*;

public class Ques2 {

    static int findCost(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        int minCost=0;
        while(pq.size() > 1){
            int firstSmallestNum = pq.remove();
            int secondSmallestNum = pq.remove();
            minCost += firstSmallestNum + secondSmallestNum;
            pq.add(firstSmallestNum + secondSmallestNum);
        }

        return minCost;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};

        int minCost = findCost(arr);
        System.out.println(minCost);

    }
}
