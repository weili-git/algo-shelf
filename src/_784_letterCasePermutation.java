import java.util.ArrayList;
import java.util.List;

public class _784_letterCasePermutation {
    List<String> res;
    StringBuilder sb;
    public List<String> letterCasePermutation(String s) {
        res = new ArrayList<>();
        sb = new StringBuilder();
        help(s, 0);
        return res;
    }
    private void help(String s, int index){
        if(index==s.length())res.add(sb.toString());
        else{
            if(s.charAt(index) >='0' && s.charAt(index)<='9') {
                sb.append(s.charAt(index));
                help(s, index+1);
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(lower(s.charAt(index)));
                help(s, index+1);
                sb.deleteCharAt(sb.length()-1);
                sb.append(upper(s.charAt(index)));
                help(s, index+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    private char lower(char a){
        return a>'Z'?a:(char)(a+'a'-'A');
    }
    private char upper(char a){
        return a>'Z'?(char)(a+'A'-'a'):a;
    }
}
