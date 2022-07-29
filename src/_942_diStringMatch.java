import java.util.Arrays;

public class _942_diStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] = i;
        }
        int i=0,j=n-1;
        int tmp;
        while(i<=j){
            while(i<n && s.charAt(i)=='I') i++;
            while(j>=0 && s.charAt(j)=='I') j--;
            if(i<=j){
                tmp = res[i];
                res[i] = res[j+1];
                res[j+1] = tmp;
            }
            i++;j--;
        }
        return res;
    }
}
