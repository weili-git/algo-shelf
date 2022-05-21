import java.util.Arrays;

public class _542_updateMatrix {
    private static int row;
    private static int col;
    private static int[][] vector = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1,0}};
    public static int[][] updateMatrix(int[][] mat) {
        row = mat.length;
        col = mat[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1) mat[i][j] = row+col;   // 不是i+j
                if(i>0){
                    mat[i][j] = Math.min(mat[i][j], mat[i-1][j]+1);
                }
                if(j>0){
                    mat[i][j] = Math.min(mat[i][j], mat[i][j-1]+1);
                }
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (i < row - 1) {
                    mat[i][j] = Math.min(mat[i][j], mat[i + 1][j] + 1);
                }
                if (j < col - 1) {
                    mat[i][j] = Math.min(mat[i][j], mat[i][j + 1] + 1);
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 1}, {1, 0}};
        int[][] res = updateMatrix(mat);
        for(int[] nums:res){
            for(int num:nums){
                System.out.printf("%d ", num);
            }
            System.out.printf("\n");
        }
    }
}
