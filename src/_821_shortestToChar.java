public class _821_shortestToChar {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] res = new int[n];
        int dst = 0;    // between two c
        int last = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=c) {
                if(i!=n-1) dst++;
                else{
                    dst++;
                    for(int k=n-1;dst>0;k--){
                        res[k] = dst;
                        dst--;
                    }
                }
            }
            else{
                int tmp = dst;
                for(int k=i-1;dst>0&&k>last+tmp/2;k--){
                    res[k] = tmp-dst+1;
                    dst--;
                }
                for(int k=i-(tmp-dst)-1;dst>0&&k<=last+tmp/2;k--){
                    res[k] = dst;
                    dst--;
                }
                last = i;   //
            }
        }
        return res;
    }
}
