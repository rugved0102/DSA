<<<<<<< HEAD
public class ceiling_of_a_no {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int result = ceiling(arr,target);
        System.out.println(result);
    }

    static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid -1;
            }
            else {
                return arr[mid];
            }
        }


        return arr[start];
    }
=======
public class ceiling_of_a_no {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        int result = ceiling(arr,target);
        System.out.println(result);
    }

    static int ceiling(int arr[], int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid -1;
            }
            else {
                return arr[mid];
            }
        }


        return arr[start];
    }
>>>>>>> 3ed577972d36ae5162ef145934aaa3f1f6fcc846
}