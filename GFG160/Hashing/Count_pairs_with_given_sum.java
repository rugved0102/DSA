//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/hashing-gfg-160/problem/count-pairs-with-given-sum--150253
package GFG160.Hashing;

import java.util.HashMap;

public class Count_pairs_with_given_sum {
     int countPairs(int arr[], int target) {
       int cnt = 0;
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for(int i = 0; i < arr.length; i++) {
           int comp = target - arr[i];
           if(map.containsKey(comp)) {
               cnt += map.get(comp);
           }
           map.put(arr[i], map.getOrDefault(arr[i],0)+1);
       }
       return cnt;
    }
}
