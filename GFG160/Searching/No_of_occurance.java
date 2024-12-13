// class No_of_occurance {
//     int countFreq(int[] arr, int target) {
//         int cnt = 0;
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == target) {
//                 cnt++;
//             }
//         }
//         return cnt;
//     }
// }

//------------------------------------------------------------------------------------

class No_of_occurance {
    int countFreq(int[] arr, int k) {
        int first = first(arr, k);
        if(first == -1) return 0;
        int last = last(arr, k);
        return last - first + 1;
    }
     public static int first(int arr[], int k) {
        int s = 0;
        int e = arr.length - 1;
        int first = -1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(arr[m] == k){
                first = m;
                e = m - 1;
            }
            else if(arr[m] > k) {
                e = m - 1;
            }
            else {
                s = m + 1;
            }
        }
        return first;
    }
    public static int last(int arr[], int k) {
        int s = 0;
        int e = arr.length - 1;
        int last = -1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(arr[m] == k){
                last = m;
                s = m + 1;
            }
            else if(arr[m] > k) {
                e = m - 1;
            }
            else {
                s = m + 1;
            }
        }
        return last;
    }
}