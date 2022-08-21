public class _1832_checkIfPangram {
    public boolean checkIfPangram(String sentence) {
        int[] cnt = new int[26];
        for(char ch: sentence.toCharArray()){
            cnt[ch-'a']++;
        }
        for(int n:cnt){
            if(n==0) return false;
        }
        return true;
    }
}
