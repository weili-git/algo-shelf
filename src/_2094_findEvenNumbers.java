import java.util.*;

public class _2094_findEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        int[] cnt = new int[10];
        for(int n:digits){
            cnt[n]++;
        }
        Set<Integer> res = new HashSet<>(); // important
        for(int i=1;i<10;i++){
            if(cnt[i]==0) continue;
            cnt[i]--;
            for(int j=0;j<10;j++){
                if(cnt[j]==0) continue;
                cnt[j]--;
                for(int k=0;k<10;k+=2){ // range(0, 10, 2)
                    if(cnt[k]==0) continue;
                    res.add(i*100+j*10+k);
                }
                cnt[j]++;
            }
            cnt[i]++;
        }
        int index = 0;
        int[] ss = new int[res.size()];
        for(int n:res){
            ss[index++] = n;
        }
        Arrays.sort(ss);
        return ss;
    }
}
