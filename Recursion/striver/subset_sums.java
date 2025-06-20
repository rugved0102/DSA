import java.util.*;
// User function Template for Java//User function Template for Java
class subset_sums {
    public static ArrayList<Integer> subsetsums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(0, 0, arr, list);
        Collections.sort(list);
        return list;
    }
    public static void helper(int index, int sum, int[] arr, ArrayList<Integer> ds) {
        if(index == arr.length) {
            ds.add(sum);
            return;
        }
        // ds.add(arr[index]);
        
        helper(index+1, sum+arr[index], arr, ds);
        helper(index+1, sum, arr, ds);
    }
    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(subsetsums(arr));

    }
}