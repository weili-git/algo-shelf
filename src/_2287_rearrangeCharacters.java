public class _2287_rearrangeCharacters {
    public int rearrangeCharacters(String s, String target) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for(char ch:s.toCharArray()) cnt1[ch-'a']++;
        for(char ch:target.toCharArray()) cnt2[ch-'a']++;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(cnt2[i]!=0){
                res = Math.min(res, cnt1[i]/cnt2[i]);
            }
        }
        return res;
    }
}
