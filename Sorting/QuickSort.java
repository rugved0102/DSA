import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        // sort(arr, 0, arr.length-1);
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int low, int high) {
        if(low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }

    // Using first elem as pivot

    public static void qs(int[] arr, int low, int high) {
        
        
        if(low < high) {
        
        int partitionIndex = partition(arr, low, high);

        qs(arr, low, partitionIndex-1);
        qs(arr,  partitionIndex+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
       
        int i = low;
        int j = high;
        int pivot = arr[low];
        while (i<=j) {
            while (arr[i] <= pivot && i <= high-1) {
                i++;
            }
            while (arr[j] > pivot && j >= low+1) {
                j--;
            }
            if(i < j) swap(arr, i, j);

        }
        swap(arr, j, low);
        return j;

    }
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}


// Space Complexity
// Best and Avg Case : O(log n)  // for recursive calls
// Worst Case : O(n)             // smallest or largest elem is pivot

// | Case         | Recurrence Relation             | Time Complexity |
// | ------------ | ------------------------------- | --------------- |
// | Best Case    | T(n) = 2T(n/2) + O(n)           | O(n log n)      |
// | Average Case | T(n) = T(cn) + T((1−c)n) + O(n) | O(n log n)      |
// | Worst Case   | T(n) = T(n−1) + O(n)            | O(n²)           |
