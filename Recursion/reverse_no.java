public class reverse_no {
    public static void main(String[] args) {
        rev(1234);
    }
    private static int rev(int n) {
        if(n%10 == n) {
            return n;
        }
        return rev(n/10) + n%10;
    }
}
