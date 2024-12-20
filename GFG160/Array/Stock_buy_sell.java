public class Stock_buy_sell {
    public int maximumProfit(int prices[]) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        
        for(int i = 0; i < prices.length; i++){
         min = Math.min(min, prices[i]);
         res = Math.max(res,prices[i]-min);
        }
        return res;
    }
}
