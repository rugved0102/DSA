public class factorial_of_a_no {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n) {
        if(n == 1) {
            return n;
        }
        return (n*fact(n-1));
    }
}
