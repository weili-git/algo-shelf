import java.util.HashSet;

public class _961_repeatedNTimes {
    public int repeatedNTimes(int[] nums) { // 相同的数字要么都不相邻，要么一定存在至少一个相邻。
//        HashSet<Integer> set = new HashSet<>();
//        for(int num:nums){
//            if(!set.contains(num)){
//                set.add(num);
//            }else{
//                return num;
//            }
//        }
//        return nums[0];
        if(nums[0]==nums[2]) return nums[0];
        if(nums[1]==nums[3]) return nums[1];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return nums[i];
        }
        return nums[0];
    }
}
