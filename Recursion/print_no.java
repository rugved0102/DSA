public class print_no {
    public static void main(String[] args) {
        prt(6);
    }
    private static void prt(int n) {
        if(n < 1) {
            return;
        }
        System.out.println(n);
        --n;
        prt(n);
    }
}
