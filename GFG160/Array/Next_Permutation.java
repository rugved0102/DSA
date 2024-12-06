public class Next_Permutation {


    void nextPermutation(int[] arr) {
        int pivot = -1;
        int n = arr.length;
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1) {
            reverse(arr, 0, n-1);
            return;
        }
        
        for(int i = n-1; i > pivot; i--) {
            if(arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
            
        }
        
        reverse(arr, pivot+1, n-1);
        
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start++, end--);
        }
    }
    private static void swap(int[] arr,int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}

