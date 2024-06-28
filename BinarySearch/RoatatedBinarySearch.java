class RoatatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 7;
        int res = search(nums,target);
        System.out.println(res);
    }
    static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        
        
        if(peak == -1) {
            return bs(nums,target,0,nums.length-1);
        }
        if(nums[peak] == target) {
            return peak;
        }
        if(target >= nums[0]) {
            return bs(nums,target,0,peak-1);
        }
        return bs(nums,target,peak+1,nums.length-1);
    }
static int findPeak(int[] arr) {
    int s = 0;
    int e = arr.length - 1;
    
    while(s<=e) {
        int m = s + (e-s)/2;
        if(m < e && arr[m] > arr[m+1]) {
            return m;
        }
        if(m > s && arr[m] < arr[m-1]) {
            return m-1;
        }
        if(arr[m] <= arr[s]) {
            e = m - 1;
        }
        else {
            s = m + 1;
        }
    }
    return -1;
}

    static int bs(int[] arr,int target, int s, int e) {
        
        while (s <= e) {
            int m = s + (e-s)/2;

            if(target > arr[m]) {
                s = m +1;
            }
            else if(target < arr[m]) {
                e = m - 1;
            }
            else {
                return m;
            }
        }
        return -1;
    }
}