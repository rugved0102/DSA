public class print_n_to_1_backtrack {
    public static void main(String[] args) {
        helper(0, 8);
    }
    public static void helper(int s, int n) {
        if(s == n) {
            return;
        }
        System.out.println(n);
        helper(s, n-1);

    }
}
