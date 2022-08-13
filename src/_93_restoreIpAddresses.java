import java.util.ArrayList;
import java.util.List;

public class _93_restoreIpAddresses {//!!!!!!!!!!!
    List<String> temp = new ArrayList<>();
    List<String> list = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0);
        return list;
    }

    private void backtrack(String s, int begin) {
        if (temp.size() == 4 && begin != s.length()) return;
        if(temp.size() == 4 && begin == s.length()){
            list.add(String.join(".", temp));//这个join函数用时2ms，手动StringBuilder的话就是1ms
            return;
        }
        for(int i = begin; i < s.length() && i < begin + 3; i++){
            String sub = s.substring(begin, i + 1);
            if(Integer.parseInt(sub) <= 255){
                if(sub.length() > 1 && s.charAt(begin) == '0'){
                    return;
                }
                temp.add(sub);
                backtrack(s, i + 1);
                temp.remove(temp.size() - 1);
            }else{
                return;
            }
        }
    }
}
