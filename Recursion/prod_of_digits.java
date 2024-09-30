public class prod_of_digits {
    
        public static void main(String[] args) {
            System.out.println(prod(1234));
        }
        private static int prod(int n) {
            if(n%10 == n) {
                return n;
            }
         
            
            return n%10 * prod(n/10);
        }
    
    
}
