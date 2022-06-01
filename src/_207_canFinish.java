import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _207_canFinish {
    public boolean canFinish(int numCourses, int[][] prerequisites) {//top sort
        int[] indegree = new int[numCourses];
        List<Integer>[] graph = build(numCourses, prerequisites, indegree);
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.offer(i);
        }
        if(q.isEmpty()) return false;
        boolean[] vis = new boolean[numCourses];
        while (!q.isEmpty()){
            int cur = q.poll();
            vis[cur] = true;
            for(int i:graph[cur]){
                if(--indegree[i]==0) q.offer(i);
            }
        }
        for(boolean t:vis){
            if(!t) return false;
        }
        return true;
    }
    private List<Integer>[] build(int numCourses, int[][] arrs, int[] indegree){
        List<Integer>[] graph = new LinkedList[numCourses];
        for(int i=0;i<numCourses;i++){
            graph[i] = new LinkedList<>();
        }
        for(int[] arr: arrs){
            int start = arr[1], end = arr[0];
            graph[start].add(end);
            indegree[end]++;
        }
        return graph;
    }
}
