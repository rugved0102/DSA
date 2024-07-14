import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
       int[][] matrix = {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16},
       } ;
       int target = 12;
       System.out.println(Arrays.toString(search(matrix, target)));
    }
    public static int[] binarySearch(int[][] matrix,int row,int cStart, int cEnd ,int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if(target == matrix[row][mid]) {
                return new int[]{row, mid};
            }
            if(target < matrix[row][mid]){
                cEnd = mid - 1;
            }
            else {
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (col == 0){
            return new int[] {-1,-1};
        }
        if (row == 1) {
            return binarySearch(matrix,0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = row - 1;
        int cMid = col/2;
        while(rStart < (rEnd-1)) {
            int mid = rStart + (rEnd - rStart)/2;
                if(target == matrix[mid][cMid]) {
                    return new int[]{mid,cMid};
                }
                if(target < matrix[mid][cMid]) {
                    rEnd = mid;
                }
                else {
                    rStart = mid;
                }
        }

        //now we have 2 rows
        //mid wale to target nhi na vo check kr lo
        if(target == matrix[rStart][cMid]) {
            return new int[]{rStart,cMid};
        }
        if(target == matrix[rStart+1][cMid]) {
            return new int[]{rStart+1,cMid};
        }

        // In those 2 rows u have to find in which part lies the ans

        //in 1st part
        if(target < matrix[rStart][cMid]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        //in 2nd part
        if(target > matrix[rStart][cMid] && target <= matrix[rStart][col-1]){
            return binarySearch(matrix, rStart, cMid+1, col-1, target);
        }

        //in 3rd part
        if(target < matrix[rStart+1][cMid]) {
            return binarySearch(matrix, rStart+1,0, cMid-1, target);
        }
        //in 4th part
        else {
            return binarySearch(matrix, rStart+1, cMid+1, col-1, target);
        }




        //return new int[]{-1,-1};
    }
}
