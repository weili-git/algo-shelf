import java.util.Arrays;

public class _1971_validPath {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] find = new int[n];
        Arrays.fill(find, -1);
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            while(find[a]!=-1) a = find[a];

            while(find[b]!=-1) b = find[b];

            if(a!=b) find[a] = b;
        }
        while(find[source]!=-1) source=find[source];
        while(find[destination]!=-1) destination=find[destination];
        return source==destination;
    }
}
