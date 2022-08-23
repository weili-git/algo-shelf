import java.util.HashSet;
import java.util.Set;

public class _2062_countVowelSubstrings {
    public int countVowelSubstrings(String word) {// 滑动窗口，需要理解
        String s = "aeiou";
        int len = word.length();
        int count = 0;
        for(int i = 0;i < len;i++){
            Set<Character> set = new HashSet<>();
            for(int j = i;j < len;j++){
                if(s.indexOf(word.charAt(j)) < 0){
                    break;
                }
                set.add(word.charAt(j));
                if(set.size() == 5){
                    count++;
                }
            }
        }
        return count;
    }
}
