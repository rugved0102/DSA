import java.util.HashSet;
import java.util.Set;

public class longestSuccessiveElements {

    public int longestSuccessiveElementsSolution(int[] nums) {
        int longest = 1;
        int n = nums.length;
        int cnt = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        for(int num : set) {
            if(!set.contains(num-1)) {
                int x = num;
                cnt = 1;
                while(set.contains(x+1)) {
                    cnt++;
                    x+=1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {

    }
}
