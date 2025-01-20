package GFG160.Hashing;
import java.util.*;
import java.io.*;
class Longest_Consecutive_Subsequence {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        
        int res = 1, cnt = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1])
            continue;
            
            if(arr[i] == arr[i-1]+1) {
                cnt++;
            } else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }
}