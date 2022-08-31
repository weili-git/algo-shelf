public class _2309_greatestLetter {
    public String greatestLetter(String s) {
        int[] both = new int[26];
        int[] cnt = new int[26];
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                cnt[ch-'a']++;
                both[ch-'a'] |= 1;
            }else{
                cnt[ch-'A']++;
                both[ch-'A'] |= 2;
            }
        }
        int max = Integer.MAX_VALUE;
        char res = '\0';
        for(int i=0;i<26;i++){
            if(both[i]==3){
                max = Math.min(max, cnt[i]);
                res = (char)(i+'A');
            }
        }
        if(max==Integer.MAX_VALUE) return "";
        return String.valueOf(res);
    }
}
