import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
         int[] arr = {3,5,4,1,2};
        System.out.println(Arrays.toString(insertion(arr)));;
    }
    static int[] insertion(int[] arr) {
        for(int i = 0 ; i < arr.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(arr[j-1]>arr[j]) {
                    swap(arr, j-1, j);
                }else {
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
