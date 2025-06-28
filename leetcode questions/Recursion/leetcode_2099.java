import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_2099 {
    public static int maxSum = Integer.MIN_VALUE;
    public static List<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        // Input: nums = [2,1,3,3], k = 2
        // Output: [3,3]
        // Explanation:
        // The subsequence has the largest sum of 3 + 3 = 6.
        int[] arr = {2,1,3,3};
        int k = 2;
        int[] res = maxSubsequence(arr, k);
        System.out.println(Arrays.toString(res)); // [3, 3]
    }
    public static int[] maxSubsequence(int[] nums, int k) {
        backtrack(0, nums, k, new ArrayList<>());

        int[] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
    public static void backtrack(int index, int[] nums, int k, List<Integer> curr) {
        if(curr.size() == k) {
            int sum = curr.stream().mapToInt(Integer::intValue).sum();
            if(sum > maxSum) {
                maxSum = sum;
                result = new ArrayList<>(curr);
            }
            return;
        }

        if(index == nums.length) return;

        curr.add(nums[index]);
        backtrack(index + 1, nums, k, curr);
        curr.remove(curr.size()-1);
        backtrack(index+1, nums, k, curr);

    }
}
