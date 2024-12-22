public class Search_in_matrix {
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
