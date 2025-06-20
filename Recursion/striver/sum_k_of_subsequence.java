import java.util.ArrayList;
import java.util.List;

public class sum_k_of_subsequence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        helper(0, arr, list,0, k);
    }

    public static void helper(int index, int[] arr, List<Integer> list, int sum, int k) {
        if(index == arr.length) {
            if(sum == k) {
                System.out.println(list.toString());
            }
            
            return;
            
        }
       
        if(arr[index] <= k) {
            list.add(arr[index]);
            helper(index+1, arr, list, sum + arr[index], k);
            
        }
        list.remove(list.size()-1);
        helper(index+1, arr, list, sum, k);
    }
}
