import java.util.HashSet;

public class _888_fairCandySwap {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = 0;
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int num:aliceSizes){
            diff+=num;
            set1.add(num);
        }
        for(int num:bobSizes){
            diff-=num;
            set2.add(num);
        }
        for(int num:set1){
            if(set2.contains(num-diff/2)){
                return new int[]{num, num-diff/2};
            }
        }
        return new int[]{-1, -1};
    }
}
