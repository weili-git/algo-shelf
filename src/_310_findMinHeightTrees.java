import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _310_findMinHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if(n==1) {
            res.add(0);
            return res;
        }
        int[] degree = new int[n]; //out-degree
        List<List<Integer>> map = new ArrayList<>();
        for(int i=0;i<n;i++){
            map.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            degree[edge[0]]++;
            degree[edge[1]]++;
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(degree[i]==1) queue.offer(i);
        }
        while(!queue.isEmpty()){
            res = new ArrayList<>();    // 这个地方注意，我们每层循环都要new一个新的结果集合，
            int size = queue.size();
            for(int i=0;i<size;i++){
                int cur = queue.poll();
                res.add(cur);   // 剪掉叶子节点
                List<Integer> neighbors = map.get(cur);
                for(int neighbor : neighbors){
                    degree[neighbor]--;
                    if(degree[neighbor]==1) queue.offer(neighbor);
                }
            }
        }
        return res;  // 返回最后一次保存的list
    }
}
