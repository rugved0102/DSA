public class Rotate_By_90 {
    static void rotateby90(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int mat1[][] = new int[n][m];
        int mat2[][] = new int[n][m];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                mat1[i][j] = mat[j][i];
            }
        }
        for(int i = 0; i < mat.length; i++) {
            
                mat2[n-i-1] = mat1[i];
            
        }
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length; j++) {
                mat[i][j] = mat2[i][j];
            }
        }
    }
}
