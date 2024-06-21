<<<<<<< HEAD
import java.util.*;

public class simple_BinarySearch {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // int target = 10;
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int result = bs(arr, target);
        System.out.println(result);
        sc.close();
    }

    static int bs(int arr[], int target) {
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
                return mid;
            }
        }


        return -1;
    }
=======
import java.util.*;

public class simple_BinarySearch {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // int target = 10;
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array : ");
        for(int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int result = bs(arr, target);
        System.out.println(result);
        sc.close();
    }

    static int bs(int arr[], int target) {
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
                return mid;
            }
        }


        return -1;
    }
>>>>>>> 3ed577972d36ae5162ef145934aaa3f1f6fcc846
}