import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class _994_orangesRotting {
    public int orangesRotting(int[][] grid) {//bfs
        if(grid==null||grid.length==0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        int cnt1 = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    queue.offer(i*n+j); // 烂橘子入队
                }else if(grid[i][j]==1){
                    cnt1++; // 统计新鲜橘子
                }
            }
        }
        int time = 0;
        while (!queue.isEmpty() && cnt1>0){
            time++;
            int size = queue.size();
            for(int i=0;i<size;i++){
                int p = queue.poll();
                int x = p/n, y = p%n;   // i,j
                if(x-1>=0 && grid[x-1][y]==1){
                    cnt1--;
                    grid[x-1][y] = 2;
                    queue.offer((x-1)*n+y);
                }
                if(x+1<m && grid[x+1][y]==1){
                    cnt1--;
                    grid[x+1][y] = 2;
                    queue.offer((x+1)*n+y);
                }
                if(y-1>=0 && grid[x][y-1]==1){
                    cnt1--;
                    grid[x][y-1] = 2;
                    queue.offer(x*n+y-1);
                }
                if(y+1<n && grid[x][y+1]==1){
                    cnt1--;
                    grid[x][y+1] = 2;
                    queue.offer(x*n+y+1);
                }
            }
        }
        return cnt1==0?time:-1;
    }
}