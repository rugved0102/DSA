class GCD {
    
        public static int calcGCD(int n, int m){
            while (m != 0) {
                int temp = m;
                m = n % m;
                n = temp;
            }
            return n;
        }
    
}