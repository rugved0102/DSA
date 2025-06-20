public class sum_of_n_numbers {
    public static void main(String[] args) {
        System.out.println(helper(1,5, 0));
        System.out.println(helper1(1,8));
    }
    public static int helper(int s, int n, int sum) {
        if(s > n) return sum;
        return helper(s+1, n, sum+s);
    }

    public static int helper1(int s, int n) {
        if(s > n) return 0;
        return s + helper1(s+1, n);
    }
}
