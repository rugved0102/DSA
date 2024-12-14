public class search_in_roatated_sorted_array {
    int search(int[] arr, int key) {
        int peak = findPeak(arr);
        if(peak == -1) {
            return bs(arr,key,0,arr.length -1);
        }
        if(arr[peak] == key) {
            return peak;
        }
        if(arr[0] <= key) {
            return bs(arr, key, 0, peak - 1);
        }
        return bs(arr, key, peak + 1, arr.length - 1);
    }
    // int findPeak(int[] arr) {
    //     //int peak = -1;
    //     int s =0;
    //     int e = arr.length - 1;
    //     while(s <= e) {
    //         int m = s + (e-s)/2;
    //         if(arr[m] < arr[m-1] && m>s) {
    //             return m-1;
    //         }
    //         if(arr[m] < arr[m + 1] && m < e) {
    //             return m+1;
    //         }
    //         if(arr[s] >= arr[m]) {
    //             e = m -1;
    //         }
    //         else {
    //             s = m + 1;
    //         }
    //     }
    //     return -1;
    // }
    int findPeak(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s <=e) {

        int m = s + (e-s)/2;    
            if(m < e && nums[m] > nums[m+1]) {
            return m;
        }
        if(m > s && nums[m-1] > nums[m]) {
            return m-1;
        }
        if(nums[s] >= nums[m]) {
            e = m -1;
        }
        else {
            s = m + 1;
        }
        }
        return -1;
        
    }

    int bs(int[] arr, int key, int s, int e) {
        //  int s =0;
        // int e = arr.length - 1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(arr[m] == key) {
                return m;
            }
            else if(key > arr[m]) {
                s = m + 1;
            }
            else {
                
                e = m -1;
            }
        }
        return -1;
    }
}
