public class reverse_no {
   static int sum = 0;
   static int reversed = 0;
    public static void rev(int n) {
        
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum*10 + rem;
        rev(n/10);
        //return sum;
        
    }
    public static int rev1(int n,int reversed) {
        
        if(n == 0) {
            return reversed;
        }
        
        return rev1(n/10, reversed*10 + n%10);
    }
    public static void main(String[] args) {
        rev(1234);
        //System.err.println(rev(1234));
        System.err.println(rev1(1234,0));
        System.out.println(sum);
        
    }
}
