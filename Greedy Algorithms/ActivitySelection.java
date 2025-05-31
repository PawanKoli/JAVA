import java.util.*;

public class ActivitySelection{
    public static void main(String[] args) {

        //sorted accouding to end time
        // int start[] = {1,3,0,5,8,5};
        // int end[] = {2,4,6,7,9,9};
        int start[] = {5,3,0,5,8,1};
        int end[] = {9,4,6,7,9,2};


        //If activities were not sorted according to end time
            int activities[][] = new int[start.length][3];
            for(int i=0; i<end.length;i++){
                activities[i][0] = i;
                activities[i][1] = start[i];
                activities[i][2] = end[i];

            } 

            //lambda function  -> shortform
            //in Java, Comparator is an Interface for sorting  Java Objects
            Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(activities[0][0]);
            int prevend = activities[0][2];

            for(int i=0; i<end.length;i++){
                if(activities[i][1] >= prevend){
                    ans.add(activities[i][0]);  // index
                    prevend = activities[i][2];
                }
            }

        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(0);  //index
        // int prevEnd = end[0];

        // for(int i=1; i<end.length; i++){
        //     if(start[i] >= prevEnd){
        //         ans.add(i);
        //         prevEnd = end[i];
        //     }
        // }

        System.out.println("Max Activities : " + ans.size());

        for(int i=0; i<ans.size(); i++){
            System.out.println( "A" + ans.get(i)+ " -> " + start[ans.get(i)] + " - " + end[ans.get(i)]);
        }
    }
}