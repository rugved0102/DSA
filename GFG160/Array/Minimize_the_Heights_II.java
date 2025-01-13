import java.util.Arrays;

public class Minimize_the_Heights_II {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int smallest = arr[0]+k;
        int largest = arr[n - 1]-k;
        int ans =arr[n-1]-arr[0];
        
        int max = 0;
        int min = 0;
        
        for(int i = 0; i < n-1; i++) {
            min = Math.min(smallest, arr[i+1]-k);
            max = Math.max(largest, arr[i]+k);
            if(min < 0) continue;
            
            ans = Math.min(ans, max-min);
        }
        return ans;
    }

}