// package Recursion;

public class print_1_to_n {
    public static void main(String[] args) {
        helper(1, 12);
    }

    public static void helper(int s, int n) {
        if(s > n) return;
        System.out.println(s);
        helper(s+1, n);
    }
}
