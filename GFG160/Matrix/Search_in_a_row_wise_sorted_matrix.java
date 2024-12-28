//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-row-wise-sorted-matrix

public class Search_in_a_row_wise_sorted_matrix {
    public boolean searchRowMatrix(int[][] mat, int x) {
        for(int i = 0; i < mat.length; i++) {
            int s = 0, e = mat[0].length-1;
            while(s <= e) {
                int m = s + (e-s)/2;
                if(mat[i][m] == x) {
                    return true;
                }
                else if(mat[i][m] < x) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
        }
        return false;
     }
}
