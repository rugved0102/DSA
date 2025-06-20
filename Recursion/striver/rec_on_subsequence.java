import java.util.ArrayList;

public class rec_on_subsequence {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        helper(0, arr, list);
    }
    public static void helper(int index, int[] arr, ArrayList<Integer> list) {
        if(index >= arr.length) {
            System.out.println(list.toString());
            return;
        }
        list.add(arr[index]);
        helper(index+1, arr, list);

        list.remove(list.size()-1);

        helper(index+1, arr, list);
    }
}
