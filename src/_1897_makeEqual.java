import java.util.HashMap;

public class _1897_makeEqual {
    public boolean makeEqual(String[] words) {
        int[] cnt = new int[26];
        int num = 0;
        for(String str: words){
            num += str.length();
            for(char ch: str.toCharArray()){
                cnt[ch-'a']++;
            }
        }
        int len = words.length;
        if(num%len!=0) return false;
        for(int n:cnt){
            if(n%len!=0) return false;
        }
        return true;
    }
}
