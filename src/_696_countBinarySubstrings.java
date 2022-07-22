public class _696_countBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int res=0,pre=0,cur=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cur++;
            }else{
                pre = cur;
                cur = 1;
            }
            if(pre >= cur){
                res++;
            }
        }
        return res;
    }
}
