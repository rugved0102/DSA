//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class Single_elem_in_sorted_arr {
    // Using Freq counting

        // public int singleNonDuplicate(int[] nums) {
        //     int[] arr = new int[100001];
        //     int ans = 0;
        //     for(int num : nums) {
        //         arr[num]++;
        //     }
        //     for(int i = 0; i < arr.length; i++) {
        //         if(arr[i] == 1){
        //             ans = i;
        //         }
        //     }
        //     return ans;
        // }



    // Using BS

    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s < e) {
            int m = s + (e-s)/2;
            if(nums[m] == nums[m+1]) {
                m = m - 1;
            };
            int leftPartLen = m - s + 1;
            if(leftPartLen % 2 == 1) {
                e = m;
            }
            else 
                s = m + 1;
        }
        return nums[e];
    }
    
}
