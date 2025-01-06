import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.util.Pair;

public class Sum_Pair_closest_to_target {
    public List<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int s = 0, e = arr.length-1;
        while(s < e) {
            int sum = arr[s] + arr[e];
            if(Math.abs(target - sum) < minDiff) {
                minDiff = Math.abs(target - sum);
                res = Arrays.asList(arr[s], arr[e]);
            }
            if(sum < target) {
                s++;
            } else if(sum > target) {
                e--;
            } else {
                return res;
            }
        }
        return res;
}
}
