import java.util.HashMap;
import java.util.Map;

public class _1742_countBalls {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<>();
        int tmp;
        int j;
        for(int i=lowLimit;i<=highLimit;i++){
            tmp = 0;
            j = i;
            while(j!=0){
                tmp += j%10;
                j = j/10;
            }
            map.put(tmp, map.getOrDefault(tmp, 0)+1);
        }
        int max = 0;
        for(int n: map.values()){
            max = Math.max(max, n);
        }
        return max;
    }
}
