package package1;

public class Sol122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy_price = 0;

        if(prices.length > 0)  buy_price = prices[0];
        
        for(int i=0; i< prices.length - 1; i++){
            
            if(prices[i] > prices[i+1]){
                buy_price = prices[i+1];
            }
            
            if(prices[i] <= prices[i+1]){
                if(i+1 == prices.length -1){ // the end of the price list
                    profit += prices[i+1] - buy_price;
                }
                else if(prices[i+1] > prices[i+2]){ // it falls after i+1
                    profit += prices[i+1] - buy_price;
                }
            }
        }

        return profit;
    }
}