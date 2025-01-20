package GFG160.Hashing;

import java.util.HashSet;

class Union_of_arrays_with_duplicate {
    public static int findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for(int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
}