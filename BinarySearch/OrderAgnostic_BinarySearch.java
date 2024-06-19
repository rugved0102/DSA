public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6,7,88,99,990,8880,8786760};
        int arr[] = {90,80,70,6,5,4,3,2,1,0,-1,-2};
        int target = 70;
        int result = orderAgnosticBS(arr, target);
        System.out.println(result);
    }
    static int orderAgnosticBS(int arr[],int target) {
        int s = 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        
        
        while (s <= e) {
            int mid = s + (e-s)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else {
                if(isAsc) {
                    if(arr[mid] > target) {
                        e = mid - 1;
                    }
                    else if(arr[mid] < target) {
                        s = mid + 1;
                    }
                }
                else {
                    if(arr[mid] < target) {
                        e = mid - 1;
                    }
                    else if(arr[mid] > target) {
                        s = mid + 1;
                    }
                }
            }
        }
        

        return -1;
    }
}
