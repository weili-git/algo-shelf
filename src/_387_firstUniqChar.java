import java.util.Arrays;

public class _387_firstUniqChar {
    public int firstUniqChar(String s) {
        int[] dict = new int[26];
        for(int i=0;i<s.length();i++){
            dict[(int)(s.charAt(i)-'a')]++;
        }
        for(int i=0;i<s.length();i++){
            if(dict[(int)(s.charAt(i)-'a')]==1) return i;
        }
        return -1;
    }
}
