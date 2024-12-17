public class AggresiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int res = 0;
        int minDist = 1;
        int maxDist = stalls[stalls.length - 1] - stalls[0];
        
        while(minDist <= maxDist) {
            int m = minDist + (maxDist-minDist)/2;
            if(CheckIfPossible(stalls,k,m)) {
                res = m;
                minDist = m + 1;
            }
            else {
                maxDist = m - 1;
            }
        }
        return res;
    }
    public static boolean CheckIfPossible(int[] stalls, int NoOfcow, int dist) {
        int cnt = 1;  
       int last = stalls[0]; // we put cow 1 at 0th index
       for(int i = 1; i < stalls.length; i++) {
           if(stalls[i]-last >= dist) {
               last = stalls[i];
               cnt++;
           }
        
       }
       return (cnt >= NoOfcow);
    }
}
