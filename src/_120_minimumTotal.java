import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120_minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle==null || triangle.size()==0) return 0;
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            List<Integer> curTr = triangle.get(i);
            for(int j=0;j<curTr.size();j++){
                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + curTr.get(j);
            }
        }
        return dp[0][0];
    }
}
