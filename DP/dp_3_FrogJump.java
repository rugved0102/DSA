import java.util.Arrays;

public class dp_3_FrogJump {
    public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        int[] dp = new int[heights.length+1];
        Arrays.fill(dp, -1);
        // System.out.println(rec(0, heights));
        // System.out.println(memo(heights.length-1, heights, dp));
        // System.out.println(tabulation(0, heights));
        System.out.println(optimized_tabulation(4, heights));
    }
    public static int rec(int i, int[] heights) {
        if(i == (heights.length-1)) {
            return 0;
        }
        int JumpOne = Integer.MAX_VALUE;
        int JumpTwo = Integer.MAX_VALUE;

        if(i + 1 < heights.length) {
            JumpOne = rec(i+1, heights) + Math.abs(heights[i] - heights[i+1]);
        }
        if(i + 2 < heights.length) {
            JumpTwo = rec(i+2, heights) + Math.abs(heights[i] - heights[i+2]);
        }
        return Math.min(JumpOne, JumpTwo);
    }
    public static int memo(int i, int[] heights, int[] dp) {
        if(i == 0) return 0;
        if(dp[i] != -1) return dp[i];
        int JumpTwo = Integer.MAX_VALUE;

        int JumpOne = memo(i-1, heights, dp) + Math.abs(heights[i] - heights[i-1]);

        if(i > 1) {
            JumpTwo = memo(i-2, heights, dp) + Math.abs(heights[i] - heights[i-2]);
        }
        return dp[i] = Math.min(JumpOne, JumpTwo);
    }
    

    public static int tabulation(int n, int[] heights) {
        int[] dp = new int[heights.length+1];
        dp[0] = 0;

        for(int i = 1; i < heights.length; i++) {
            int jumpOne = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            int jumpTwo = Integer.MAX_VALUE;
            if(i > 1) {
                jumpTwo = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        return dp[heights.length-1];
    }

    public static int optimized_tabulation(int n, int[] heights) {
        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1; i < n; i++) {
            int jumpOne = prev1 + Math.abs(heights[i] - heights[i-1]);
            int jumpTwo = Integer.MAX_VALUE;
            if(i > 1) {
                jumpTwo = prev2 + Math.abs(heights[i] - heights[i-2]);
            }
            int curr = Math.min(jumpOne, jumpTwo);
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
}
