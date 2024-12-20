import java.util.*;
class SpirallyTraversed{
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> list = new ArrayList<>();
        int rowS = 0, rowE = mat.length-1, colS = 0, colE = mat[0].length-1;
        while(rowS <= rowE && colS <= colE) {
            for(int i = colS; i <= colE; i++) {
                list.add(mat[rowS][i]);
            }
            rowS++;
            
            for(int i = rowS; i <= rowE; i++) {
                list.add(mat[i][colE]);
            }
            colE--;
            
            if(rowS <= rowE) {
                for(int i = colE; i >= colS; i--) {
                list.add(mat[rowE][i]);
            }
            
            
            }
            rowE--;
            
            if(colS <= colE) {
                for(int i = rowE; i >= rowS; i--) {
                    list.add(mat[i][colS]);
                }
            
            }
            colS++;
        }
        return list;
    }
}