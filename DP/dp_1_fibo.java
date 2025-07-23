import java.util.Arrays;
import java.util.Scanner;

class dp_1_fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        // System.out.println(fibo(n));
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        // System.out.println(memo_fibo(n, dp));
        // System.out.println(tabu(n));
        System.out.println(optimized_tabu(n));
        sc.close();
    }
    public static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static int memo_fibo(int n, int[] dp) {
        if(n<= 1) return n;
        
        if(dp[n] != -1) return dp[n];
        dp[n] = memo_fibo(n-1, dp) + memo_fibo(n-2, dp);
        return dp[n];
    }
    public static int tabu(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];

        }
        return dp[n];

    }
    public static int optimized_tabu(int n) {
        if(n <= 1) return n;
        int prev1 = 1;
        int prev2 = 0;
        
        for(int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;

    }
}