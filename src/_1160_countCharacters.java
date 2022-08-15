import java.util.Arrays;

public class _1160_countCharacters {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        for(char ch: chars.toCharArray()){
            count[ch-'a']++;
        }
        int res = 0;
        int[] tmp = new int[26];
        for(String str: words){
            boolean invalid = false;
            tmp = Arrays.copyOf(count, count.length);
            for(char ch: str.toCharArray()){
                tmp[ch-'a']--;
                if(tmp[ch-'a']<0){
                    invalid = true;
                    break;
                }
            }
            if(!invalid){
                res+=str.length();
            }
        }
        return res;
    }
}
