
class subarray_with_sum_k {
    public int countSubarrays(int arr[], int k) {
         int res = 0;

        // Pick a starting point of the subarray
        for (int s = 0; s < arr.length; s++) {
            int sum = 0;

            // Pick an ending point
            for (int e = s; e < arr.length; e++) {
                sum += arr[e];
                if (sum == k)
                    res++;
            }
        }

        return res;
    }
}