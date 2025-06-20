import java.util.ArrayList;
import java.util.List;

public class modified_sum_k_subsequence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 5;
        List<Integer> list = new ArrayList<>();
        helper(0, arr, list,0, k);
    }

    public static boolean helper(int index, int[] arr, List<Integer> list, int sum, int k) {
        if(index == arr.length) {
            if(sum == k) {
                System.out.println(list.toString());
                return true;
            }
            
            return false;
            
        }
       
        
            list.add(arr[index]);
            if(helper(index+1, arr, list, sum + arr[index], k) == true) return true;
            
       
        list.remove(list.size()-1);
        if(helper(index+1, arr, list, sum, k) == true) return true;

        return false;
    }
}
