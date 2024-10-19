//https://leetcode.com/problems/sort-array-by-parity-ii/description/

public class sort_arr_by_parity_2 {
    
        public int[] sortArrayByParityII(int[] nums) {
            int odd = 1;
            int even = 0;
            while(even < nums.length && odd < nums.length) {
                if(nums[odd] % 2 != 0){
                    odd += 2;
                }
                else if(nums[even] % 2 == 0) {
                    even += 2;
                }
                else {
                    int temp = nums[even];
                    nums[even]= nums[odd];
                    nums[odd]= temp;
                    even+=2;
                    odd+=2;
                }
            }
            return nums;
        }
    
}
