import java.util.HashSet;
import java.util.Set;

public class LCP11_expectNumber {
    public int expectNumber(int[] scores) {//相同的能力值，平均期望就是1
        Set<Integer> set = new HashSet<>();
        for(int num:scores){
            set.add(num);
        }
        return set.size();
    }
}
