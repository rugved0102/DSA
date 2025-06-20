public class palindrome {
    public static void main(String[] args) {
        // String s = "assn";
        String s1 = "assa";
        System.out.println(helper(0, s1.length()-1, s1));
    }
    public static boolean helper(int i, int e, String s) {
        if(i > e) return true;
        if(s.charAt(i) != s.charAt(e)) return false;
        return helper(i+1, e-1, s);
    }
}
