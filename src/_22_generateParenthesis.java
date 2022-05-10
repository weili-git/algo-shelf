import java.util.ArrayList;
import java.util.List;

public class _22_generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTracking(res,"", 0, 0, n);
        return res;
    }
    private void backTracking(List<String> res, String ans, int l, int r, int n){
        if(l>n||r>n) return;    // invalid result
        if(l==n&&r==n) res.add(ans);
        if(l>=r){   // left parenthesis >= right parenthesis
            backTracking(res,ans+"(", l+1, r, n);
            backTracking(res,ans+")", l, r+1, n);
        }
    }
}
