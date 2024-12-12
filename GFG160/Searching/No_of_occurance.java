class No_of_occurance {
    int countFreq(int[] arr, int target) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                cnt++;
            }
        }
        return cnt;
    }
}