import java.util.Arrays;

public class _997_findJudge {
    public int findJudge(int n, int[][] trust) {
        // 用一个数组，有人相信就+1，相信别人就-1，最后剩下的位n-1的就是法官
        // 因为一个人的入度最大为n-1
        int[] aux = new int[n+1];
        for(int i = 0; i < trust.length; i ++){
            aux[trust[i][1]]++;
            aux[trust[i][0]]--;
        }
        for(int i = 1; i <= n; i ++)
            if(aux[i] == n - 1)
                return i;
        return -1;
    }
}
