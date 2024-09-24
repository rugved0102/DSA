//https://leetcode.com/problems/sort-colors/
public class Dutch_flag_algo {
    
        public void sortColors(int[] nums) {
            int low = 0;  // Pointer for 0's
            int mid = 0;  // Current pointer
            int high = nums.length - 1;  // Pointer for 2's
            
            while (mid <= high) {
                if (nums[mid] == 0) {
                    // Swap nums[low] and nums[mid], and move both pointers forward
                    swap(nums, low, mid);
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    // Move mid pointer forward for 1's
                    mid++;
                } else if (nums[mid] == 2) {
                    // Swap nums[mid] and nums[high], and move high pointer backward
                    swap(nums, mid, high);
                    high--;
                }
            }
        }
        
        // Swap function
        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    
    
}
