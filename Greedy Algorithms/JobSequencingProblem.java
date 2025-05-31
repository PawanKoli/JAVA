import java.util.*;

public class JobSequencingProblem {

    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>(); 

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        //sorting according to profits in decending order
        //to sort in ascending order obj1 - obj2
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        int totalProfit = 0;
        int time = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(time < curr.deadline){
                totalProfit += curr.profit;
                ans.add(curr.id);
                time++;
            }
        }

        System.out.println("Total Profit : " + totalProfit);

        System.out.print("Index of Jobs are : ");
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i));
            if(i != ans.size()-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
