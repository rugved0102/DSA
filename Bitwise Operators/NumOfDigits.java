public class NumOfDigits {
    public static void main(String[] args) {
        int num = 920849;
        int base = 10;
        int ans = (int) (Math.log(num)/Math.log(base)+1);
        System.out.println(ans);
    }
}
