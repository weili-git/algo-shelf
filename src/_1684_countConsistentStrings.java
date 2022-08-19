public class _1684_countConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr = new int[26];
        for(char ch: allowed.toCharArray()){
            arr[ch-'a'] = 1;
        }
        int res = 0;
        for(String str: words){
            int i=0;
            for(i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(arr[ch-'a']==0){
                    break;
                }
            }
            if(i==str.length()) res++;
        }
        return res;
    }
}
