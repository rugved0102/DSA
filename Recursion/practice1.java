public class practice1 {
    public static void main(String[] args) {
        practice1 obj = new practice1();
        int num = 5;
        //System.out.println(obj.func1(num));
        func1Rev(num);
    }
    private int func1(int num) {
        if(num < 2) {
            return num;
        }
        System.out.println(num);
        return func1(num-1);
    }
    static void func1Rev(int num) {
        if(num < 1) {
            return;
        }
        
        func1Rev(num-1);
        System.out.println(num);
    }
}
