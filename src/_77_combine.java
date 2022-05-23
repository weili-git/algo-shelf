import java.util.ArrayList;
import java.util.List;

public class _77_combine {
    private List<List<Integer>> res;
    private List<Integer> path;
    public List<List<Integer>> combine(int n, int k) {
        res = new ArrayList<>();
        path = new ArrayList<>();
        help(n, k, 0);
        return res;
    }
    private void help(int n, int k, int index){
        if(path.size()==k) res.add(new ArrayList<>(path));
        else if(index<n){
            path.add(index+1);
            help(n, k, index+1);
            path.remove(path.size()-1);
            help(n, k, index+1);
        }
    }
}
