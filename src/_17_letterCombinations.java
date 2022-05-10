import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_letterCombinations {
    Map<Character,String> table=new HashMap();
    StringBuffer sb=new StringBuffer();
    List<String> ans=new ArrayList();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return ans;
        }
        table.put('2',"abc");
        table.put('3',"def");
        table.put('4',"ghi");
        table.put('5',"jkl");
        table.put('6',"mno");
        table.put('7',"pqrs");
        table.put('8',"tuv");
        table.put('9',"wxyz");
        backTracking(digits,0);
        return ans;
    }

    public void backTracking(String str,int index){
        if(index==str.length()){
            ans.add(sb.toString());
            return;
        }
        char c=str.charAt(index);
        String tbString=table.get(c);
        int num=c=='7'||c=='9'?4:3;
        for(int i=0;i<num;++i){
            sb.append(tbString.charAt(i));
            backTracking(str,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
