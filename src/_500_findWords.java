import java.util.ArrayList;
import java.util.List;

public class _500_findWords {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        List<String> res = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            int flag = -1;
            if(row1.contains(""+words[i].charAt(0))){
                flag = 1;
            }else if(row2.contains(""+words[i].charAt(0))){
                flag = 2;
            }else if(row3.contains(""+words[i].charAt(0))){
                flag = 3;
            }
            for(int j=1;j<words[i].length();j++){
                if(row1.contains(""+words[i].charAt(j))&&flag==1){
                    continue;
                }else if(row2.contains(""+words[i].charAt(j))&&flag==2){
                    continue;
                }else if(row3.contains(""+words[i].charAt(j))&&flag==3){
                    continue;
                }else{
                    flag = -1;
                    break;
                }
            }
            if(flag!=-1) res.add(words[i]);
        }
        return res.toArray(new String[res.size()]);
    }
}
