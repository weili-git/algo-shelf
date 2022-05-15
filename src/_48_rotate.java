public class _48_rotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            int start = i;
            int end = n-i-1;
            for(int j=0;j<end-start;j++){
                int tmp = matrix[start][start+j];
                matrix[start][start+j] = matrix[end-j][start];
                matrix[end-j][start] = matrix[end][end-j];
                matrix[end][end-j] = matrix[start+j][end];
                matrix[start+j][end] = tmp;
            }
        }
    }
}
