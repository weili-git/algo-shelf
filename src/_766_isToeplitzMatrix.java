public class _766_isToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = matrix[0];
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=row[j-1]) return false;
            }
            row = matrix[i];
        }
        return true;
    }
}
