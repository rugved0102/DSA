public class Stock_Buy_and_Sell_Max_one_Transaction_Allowed {
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
