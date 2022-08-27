import java.util.HashSet;
import java.util.Set;

public class _2133_checkValid {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(set.contains(matrix[i][j])) return false;
                set.add(matrix[i][j]);
            }
            set.clear();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(set.contains(matrix[j][i])) return false;
                set.add(matrix[j][i]);
            }
            set.clear();
        }
        return true;
    }
}
