import java.util.List;

class main {
    public static int numSubseq(int[] nums, int target) {
        
    }
    public static void backtrack(int index, int[] nums, int target, int curSum, int cnt, List<Integer> list) {
        int curSum = helper();
        if(curSum <= target) {
            cnt++;
            return;
        }
        if(index >= nums.length) return;

        list.add(nums[index]);
        backtrack(index+1, nums, target, curSum, cnt, list);
        list.remove(list.size()-1);
        backtrack(index+1, nums, target, curSum, cnt, list);
    }
    public static int helper() {

    }
    public static void main(String[] args) {
        
    }
}