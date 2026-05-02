import java.util.*;

public class BuyAndSellStocks {

    public static int Array(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){                  //Profit
                int profit=prices[i]-buyPrice;       //Todays Profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }

    public static void  main(String arg[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Max Profit = "+Array(prices));
    }
}