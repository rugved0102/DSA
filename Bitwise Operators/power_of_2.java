public class power_of_2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(2));
        System.out.println(powerOfTwo(5));
        System.out.println(powerOfTwo(4));
        System.out.println(powerOfTwo(0));
    }
    public static boolean powerOfTwo(int n) {
        return n > 0 && (n & (n-1))==0;
    }
}
