public class Stock_Buy_and_Sell_Multiple_Transaction_Allowed {
    public int maximumProfit(int arr[]) {
        int ans = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1]) {
                ans += arr[i]-arr[i-1];
            }
        }
        return ans;
    }

}
