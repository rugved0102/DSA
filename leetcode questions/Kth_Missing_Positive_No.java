//https://leetcode.com/problems/kth-missing-positive-number/
public class Kth_Missing_Positive_No {
    
        public int findKthPositive(int[] arr, int k) {
            int s = 0;
            int e = arr.length-1;
            int missing = 0;
            while(s <= e) {
                int m = s + (e-s)/2;
                missing = arr[m] - (m+1);
                if(missing < k)
                    s = m + 1;
                else
                    e = m - 1;
            }
    
            return s+k; // or return (e+1) + k;
            //https://www.youtube.com/watch?v=uZ0N_hZpyps
        }
    }

