package package1;

public class Sol121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        
        int buy = prices[0];
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++){
            int current = prices [i];
            if(current < buy){
                buy = current;
            }
            else if((current - buy) > profit){
                profit = current - buy;
            }
        }
        return profit;
    }
}