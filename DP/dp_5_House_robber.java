// https://leetcode.com/problems/house-robber/description/

import java.util.Arrays;

public class dp_5_House_robber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(rec(arr, arr.length-1));
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
    }

    public static int rec(int[] arr, int n) {
        if(n == 0) return arr[n];
        if(n < 0) return 0;

        int pick = arr[n] + rec(arr, n-2);
        int not_pick = 0 + rec(arr, n-1);

        return Math.max(pick, not_pick);

    }
    
    public static int memo(int n, int[] dp, int[] arr) {
        
    }
}
