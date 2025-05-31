// Only valid in Canonical System

import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 798;

        Arrays.sort(coins,Comparator.reverseOrder());

        int countCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            if(coins[i]  <= amount){
                while(coins[i] <= amount){
                    countCoins++;
                    amount -= coins[i];
                    ans.add(coins[i]);
                }
            }
        }

        System.out.println("Total(min) coins used : " + countCoins);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
    }
}
