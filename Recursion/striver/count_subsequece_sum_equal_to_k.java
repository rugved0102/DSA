// import java.util.List;

// public class count_subsequece_sum_equal_to_k {
//     public static void main(String[] args) {
//         int[] arr = {1,2,1};
//         int[] cnt = {0};
//         helper(0, cnt, 2, 0, arr);
//         System.out.println("Count : " + cnt[0]);
//     }
//     public static void helper(int index, int[] cnt, int k, int sum, int[] arr) {
//         if(index == arr.length) {
//             if(sum == k) {
//                 cnt[0]++;
//             }

//             return;
//         }
//         helper(index+1, cnt, k, sum+arr[index], arr);

//         helper(index+1, cnt, k, sum, arr);

        
//     }
// }



// Other approach


public class count_subsequece_sum_equal_to_k {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] cnt = {0};
        System.out.println(helper(0, cnt, 2, 0, arr));
        
    }
    public static int helper(int index, int[] cnt, int k, int sum, int[] arr) {
        if(index == arr.length) {
            if(sum == k) {
               
                return 1;
            }
            else {
            return 0;
            }
        }
        int l = helper(index+1, cnt, k, sum+arr[index], arr);

        int r = helper(index+1, cnt, k, sum, arr);
        return l+r;
        
    }
}
