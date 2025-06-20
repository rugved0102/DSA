public class factorial {
    public static void main(String[] args) {
        System.out.println(helper(5));
    }
    public static int helper(int n) {
        if(n == 0) return 1;
        return n*helper(n-1);
    }
}
