import java.util.Arrays;

public class _217_containsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // nlog(n)
        for(int i=0;i<nums.length-1;i++){   // n
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
}
