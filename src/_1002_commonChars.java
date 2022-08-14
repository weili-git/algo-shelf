import java.util.ArrayList;
import java.util.List;

public class _1002_commonChars {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] count = new int[26];
        for(char ch: words[0].toCharArray()){
            count[ch-'a']++;
        }
        int[] tmp = new int[26];
        for(int i=1;i<words.length;i++){
            for(char ch: words[i].toCharArray()){
                tmp[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                count[j] = Math.min(count[j], tmp[j]);
                tmp[j] = 0; //
            }
        }
        for(int j=0;j<26;j++){
            for(int m=0;m<count[j];m++){
                char ch = 'a';
                ch += j;
                res.add(""+ch);
            }
        }
        return res;
    }
}
