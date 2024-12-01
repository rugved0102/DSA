class setZeros {
    
        public void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int[] row = new int[n];
            int[] col = new int[m];
            int[][] mat = new int[n][m];
    
        for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                        mat[i][j] = matrix[i][j];
                    }
                }
    
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(matrix[i][j] == 0) {
                        for(int k = 0; k < m; k++) {
                            mat[i][k] = 0;
                        }
                        for(int z = 0; z < n; z++) {
                            mat[z][j] = 0;
                        }
                    }
                }
            }
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                        matrix[i][j] = mat[i][j];
                    }
                }
        }
    
}