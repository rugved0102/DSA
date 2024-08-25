//https://leetcode.com/problems/sort-array-by-parity/description/
public class sort_arr_by_parity {
    
        public int[] sortArrayByParity(int[] nums) {
            int[] ans = new int[nums.length];
            int evenIndex = 0;
            int oddIndex = nums.length - 1;
            
            for (int num : nums) {
                if (num % 2 == 0) {
                    ans[evenIndex++] = num;
                } else {
                    ans[oddIndex--] = num;
                }
            }
            
            return ans;
        }
    
    
}
