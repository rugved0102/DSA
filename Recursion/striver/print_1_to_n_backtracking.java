
public class print_1_to_n_backtracking {
    public static void main(String[] args) {
        helper(3, 3);
    }
    public static void helper(int s, int n) {
        if(s < 1) {
            return;
        }
        helper(s-1, n);
        System.out.println(s);
    }
}
