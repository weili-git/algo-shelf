public class _1370_sortString {
    public String sortString(String s) {
        int[] arr = new int[26];
        int count = s.length();
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while(count>0){
            for(int i=0;i<26 && count>0;i++){
                if(arr[i]>0){
                    arr[i]--;
                    sb.append((char)('a'+i));
                    count--;
                }
            }
            for(int i=25;i>=0 && count>0;i--){
                if(arr[i]>0){
                    arr[i]--;
                    sb.append((char)('a'+i));
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
