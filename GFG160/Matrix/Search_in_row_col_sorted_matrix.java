//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/matrix-gfg-160/problem/search-in-a-matrix17201720

public class Search_in_row_col_sorted_matrix {
    public static boolean matSearch(int mat[][], int x) {
        int rows = mat.length;
         int cols = mat[0].length;
 
         int i = 0, j = cols - 1; // Start from the top-right corner
         while (i < rows && j >= 0) {
             if (mat[i][j] == x) {
                 return true; // Found the target
             } else if (mat[i][j] > x) {
                 j--; // Move left
             } else {
                 i++; // Move down
             }
         }
         return false;
     }
    }
