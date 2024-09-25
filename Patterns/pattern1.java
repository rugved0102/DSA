class pattern1 {
    public static void main(String[] args) {
        //System.out.println();
        func1(5);
    }

    public static void func1(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.println("*");
            }
        }
    }
}