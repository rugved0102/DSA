// Recursive merge sort implementation in Java
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergesort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergerec(left,right);
    }
    public static int[] mergerec(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                result[k] = first[i];
                i++;

            }
            else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length) {
            result[k] = second[i];
            j++;
            k++;
        }
        return result;
    }
}

// Time Complexity
// Best Case: O(n log n)
// Worst Case: O(n log n)
// Average Case: O(n log n)

// Space Complexity: O(n)
// The space complexity of merge sort is O(n) because it uses an auxiliary array to store the merged subarrays.
