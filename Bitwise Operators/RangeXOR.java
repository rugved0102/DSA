public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xorFun(b) ^ xorFun(a-1);
        System.out.println(ans);
    }
    public static int xorFun(int n) {
        if(n % 4 == 0) {
            return n;
        }
        if(n % 4 == 1) {
            return 1;
        }
        if(n % 4 == 2) {
            return n+1;
        }
        return 0;
    }
}
