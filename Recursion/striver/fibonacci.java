public class fibonacci {
    public static void main(String[] args) {
        // System.out.println(fiboSum(2));
        System.out.println(fibo(5));
        printFibo(0, 0, 1, 5);
    }

    public static int fiboSum(int n) {
        if(n <= 0) return 0;
        return fibo(n) + fiboSum(n-1);
    }

    public static int fibo(int n) {
        if(n <= 1) {
            return n;
        }
        
        return fibo(n-1) + fibo(n-2);
    }

    public static void printFibo(int cnt, int a, int b, int n) {
        if(cnt == n) return;
        System.out.print(a + " ");
        int c = a + b;
        printFibo(cnt+1, b, c, n);
    }
    
}