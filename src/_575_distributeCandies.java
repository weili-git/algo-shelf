import java.util.HashSet;
import java.util.Set;

public class _575_distributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> a = new HashSet<>();
        int sum = 0;
        for(int t:candyType){
            if(!a.contains(t)){
                sum++;
                a.add(t);
            }
            if(a.size()==candyType.length/2) break;
        }
        return sum;
    }
}
