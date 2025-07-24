import java.util.Arrays;

public class dp_4_Frog_K_Jump {
    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        // int ans = rec(0, heights, heights.length-1);
        // System.out.println(ans);
        int[] dp = new int[heights.length+1];
        Arrays.fill(dp, -1);
        int memo_ans = memo(0, heights, dp, 3);
        System.out.println(memo_ans);
        int tabu_ans = tabulation(heights, 2);
        System.out.println(tabu_ans);
    }
    public static int rec(int i, int[] heights, int k) {
        if(i == heights.length-1) {
            return 0;
        }
        int minCost = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++) {
            if(i+j < heights.length) {
            int jumpCost = (rec(i+j, heights, k) + Math.abs(heights[i] - heights[j+i]));
            minCost = Math.min(minCost, jumpCost);
            }
        }
    
    return minCost;
    }

    public static int memo(int i, int[] heights, int[] dp, int k) {
        if(i == heights.length-1) return 0;
        if(dp[i] != -1) return dp[i];
        
        int minCost = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++) {
            if(i+j < heights.length) {
            int jumpCost = (memo(i+j, heights, dp, k) + Math.abs(heights[i] - heights[j+i]));
            minCost = Math.min(minCost, jumpCost);
            }
        }
    
    return dp[i] = minCost;
    }

    public static int tabulation(int[] heights, int k) {
    int n = heights.length;
    int[] dp = new int[n];
    dp[0] = 0;

    for (int i = 1; i < n; i++) {
        int minCost = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                int cost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                minCost = Math.min(minCost, cost);
            }
        }

        dp[i] = minCost;
    }

    return dp[n - 1];
}

}
