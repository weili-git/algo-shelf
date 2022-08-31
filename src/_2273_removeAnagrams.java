import java.util.ArrayList;
import java.util.List;

public class _2273_removeAnagrams {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(int i=0;i<words[0].length();i++){   // 1. 计算第一个词的字符频率
            cnt1[words[0].charAt(i)-'a']++;
        }

        for(int i=1;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){   // 2. 计算后面词的字符频率
                cnt2[words[i].charAt(j)-'a']++;
            }
            boolean isAnagram = true;
            for(int k=0;k<26;k++){  // 3. 比较前后的字符频率
                if(cnt1[k]!=cnt2[k]){
                    cnt1 = cnt2;
                    isAnagram = false;
                    break;
                }
            }
            cnt2 = new int[26]; // 4. 记得清空cnt2的字符频率
            if(!isAnagram) res.add(words[i]);   // 5. 字符频率不一样，则把单词加入res
        }
        return res;
    }
}
