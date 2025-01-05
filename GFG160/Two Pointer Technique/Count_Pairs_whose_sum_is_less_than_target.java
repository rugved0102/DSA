import java.util.*;
class Count_Pairs_whose_sum_is_less_than_target {
    int countPairs(int arr[], int target) {
        // Your code here
       Arrays.sort(arr);
        
        int left = 0, right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum < target) {
                // All pairs (left, left+1), (left, left+2), ..., (left, right)
                count += (right - left);
                left++;  // Move left pointer inward
            } else {
                right--; // Move right pointer inward
            }
        }

        return count;
    }
}