import java.util.ArrayList;
import java.util.List;

public class _989_addToArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int len = num.length;
        int i = len-1;
        int c = 0;
        int d = 0;
        while(k!=0 && i>=0){
            d = k%10 + num[i] + c;
            res.add(d%10);
            c = d/10;
            i--;
            k/=10;
        }
        while(k!=0){
            d = k%10 + c;
            res.add(d%10);
            c = d/10;
            k/=10;
        }
        while(i>=0){
            d = num[i] + c;
            res.add(d%10);
            c = d/10;
            i--;
        }
        if(c!=0) res.add(1);
        List<Integer> dummy = new ArrayList<>();    // 不要用remove操作，比较耗时间
        for(int j=0;j<res.size();j++){
            dummy.add(res.get(res.size()-j-1));
        }
        return dummy;
    }
}

