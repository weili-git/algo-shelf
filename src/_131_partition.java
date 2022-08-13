import java.util.ArrayList;
import java.util.List;

public class _131_partition {// 妙哉
    List<List<String>> res = new ArrayList<>();
    List<String> path = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrace(s, 0);
        return res;
    }
    private void backtrace(String s, int index){
        if(index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isSym(s, index, i+1)){
               path.add(s.substring(index, i+1));
               backtrace(s, i+1);
               path.remove(path.size()-1);
            }
        }
    }
    private boolean isSym(String s, int begin, int end){
        int left = begin, right = end-1;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return left == right || left == right+1;//true
    }
}
