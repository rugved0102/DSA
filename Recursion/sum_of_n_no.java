public class sum_of_n_no {
    public static void main(String[] args) {
        System.out.println(sumf(5));
    }
    static int sumf(int n) {
        if(n == 1) {
            return n;
        }
        return n+sumf(n-1);
    }
}
