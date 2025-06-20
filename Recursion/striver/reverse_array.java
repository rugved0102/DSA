public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.println(helper(0, arr.length-1, arr));
        helper(0, arr.length-1, arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void helper(int s, int e, int[] arr) {
        if(s >= e) return ;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        helper(s+1, e-1, arr);
    }
}
