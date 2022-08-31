import java.util.ArrayList;
import java.util.List;

public class _2215_findDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int[] set1 = new int[2001];
        int[] set2 = new int[2001];
        List<List<Integer>> res = new ArrayList<>();
        for(int num:nums1) set1[num+1000] = 1;
        for(int num:nums2) set2[num+1000] = 1;
        List<Integer> res1 = new ArrayList<>();
        List<Integer> res2 = new ArrayList<>();
        for(int i=0;i<=2000;i++){
            if(set1[i]==1 && set2[i]==0) res1.add(i-1000);
            if(set2[i]==1 && set1[i]==0) res2.add(i-1000);
        }
        res.add(res1);
        res.add(res2);
        return res;
    }
}
