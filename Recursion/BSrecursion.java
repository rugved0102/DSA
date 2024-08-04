class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,55,76,89,98};
        int target = 76;
        System.out.println(BS(arr,target,0,arr.length-1));
    }
    public static int BS(int[] arr, int target,int s, int e){
        if(s > e) {
            return -1;
        }
        int m = s + (e-s)/2;
        if(target == arr[m]) {
            return m;
        }

        if(target < arr[m]) {
            return BS(arr, target, s, m-1);
        }
        return BS(arr, target, m+1, e);
    }
}