public class _944_minDeletionSize {
    public int minDeletionSize(String[] strs) {
        int m = strs.length;
        int n = strs[0].length();
        int res = 0;
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                if(strs[i].charAt(j)<strs[i-1].charAt(j)) {
                    res++;
                    break;
                };
            }
        }
        return res;
    }
}
