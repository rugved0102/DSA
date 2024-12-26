package GFG160.Hashing;

import java.util.Arrays;

public class TwoSum {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr);
        int s = 0, e = arr.length - 1;
        while(s < e) {
            int sum = arr[s] + arr[e];
            if(sum == target) {
                return true;
            }
            else if (sum < target) s++;
            else
                e--;
        }
        return false;
    }
}
