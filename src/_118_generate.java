import java.util.ArrayList;
import java.util.List;

public class _118_generate {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> x0 = new ArrayList<>(); x0.add(1);    // first row
        a.add(x0);
        for(int i=1;i<numRows;i++){
            List<Integer> xi = new ArrayList<>();
            xi.add(1);
            for(int j=0;j<i-1;j++){     // middle n-2 elements
                List<Integer> last =a.get(i-1);
                xi.add(last.get(j)+last.get(j+1));
            }
            xi.add(1);
            a.add(xi);
        }
        return a;
    }
}
