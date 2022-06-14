import java.util.Arrays;

public class _455_findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gratify = 0;
        int i=0;
        for(int num: g){
            if(i>=s.length) break;
            while(i<s.length && s[i]<num) i++;
            if(i<s.length){
                gratify++;
                i++;
            }
        }
        return gratify;
    }
}
