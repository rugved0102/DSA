import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        System.out.println(Arrays.toString(BubbleSorting(arr)));;
    }
    static int[] BubbleSorting(int[] arr) {
        boolean swapped;
        
        for(int i = 0; i< arr.length; i++) {
            swapped = false;
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }
       
        return arr;
    }
}
