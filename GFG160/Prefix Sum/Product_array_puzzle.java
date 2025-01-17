import java.util.Arrays;

class Product_array_puzzle {
    public static int[] productExceptSelf(int arr[]) {
        
        int pdt = 1;
        int[] res = new int[arr.length];
        int idx = -1;
        int zeros = 0;
        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == 0) {
                zeros++;
                idx = i;
            }
            else {
                pdt *= arr[i];
            }
        }
        Arrays.fill(res,0);
        if(zeros ==0) {
            for(int i = 0; i < arr.length; i++)
            res[i] = pdt/arr[i];
        }
        else if(zeros == 1) {
            res[idx] = pdt;
        }
    return res;
}
}