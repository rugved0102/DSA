public class Solution {
    
    public static void _1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _2(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _3(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _4(int n) {
        for(int i = 0; i <= n+1; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void _5(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _6(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _8(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void _9(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 2*i-1; k > 0; k--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    public static void _10(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void _11(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void _12(int n) {
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k > 0; k--) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void _13(int n) {
        for(int i = 1; i < n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i != 1) {
                for(int k = 1; k <= 2*i-3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int m = 1; m <= 2*n-1; m++) {
            System.out.print("*");
        }
    }
    public static void _14(int n) {
        for(int i = 0; i < 2*n-1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for(int i = n-1; i > 0; i--) {
            for(int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i != 1) {
                for(int k = 0; k < 2*i-3; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        _14(5);
    }
}
