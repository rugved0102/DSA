import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        System.out.println(Arrays.toString(selection(arr)));;
    }

    static int[] selection(int[] arr) {
        for(int i = 0; i<arr.length;i++) {
            int last = arr.length - i - 1;
            int MaxIndex = getMaxIndex(arr, 0, last);
            IndexSwap(arr, MaxIndex, last);
        }
        return arr;
    }

    static void IndexSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; i++) {
            
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

}
