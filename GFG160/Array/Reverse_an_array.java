public class Reverse_an_array {
    
        public static int upperBound(int []arr, int x, int n){
            int s = 0;
            int e = arr.length-1;
    
            while(s <= e) {
                int m = s + (e-s)/2;
    
                if(arr[m] > x){
                    e = m - 1;
                }
                else if (arr[m] < x) {
                    s = m + 1;
                }
                else {
                    return m;
                }
                
            }
            return e;
        }
    }
        

