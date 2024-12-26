// public class Rotate_By_90 {
//     static void rotateby90(int mat[][]) {
//         int n = mat.length;
//         int m = mat[0].length;
//         int mat1[][] = new int[n][m];
//         int mat2[][] = new int[n][m];
//         for(int i = 0; i < mat.length; i++) {
//             for(int j = 0; j < mat[0].length; j++) {
//                 mat1[i][j] = mat[j][i];
//             }
//         }
//         for(int i = 0; i < mat.length; i++) {
            
//                 mat2[n-i-1] = mat1[i];
            
//         }
//         for(int i = 0; i < mat.length; i++) {
//             for(int j = 0; j < mat[0].length; j++) {
//                 mat[i][j] = mat2[i][j];
//             }
//         }
//     }
// }

public class Rotate_By_90 {
    static void rotateby90(int mat[][]) {
    int n = mat.length;
        
        //Reversing the matrix row wise
        for(int i = 0; i < n; i++) {
            int start = 0, end = n - 1;
            while(start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        
        // Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}