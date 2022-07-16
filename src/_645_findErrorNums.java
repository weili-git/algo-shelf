public class _645_findErrorNums {
    public int[] findErrorNums(int[] nums) {
        // 寻找重复的
        int n = nums.length;
        int diff = (1+n)*n/2;
        int rep = 0;
        for(int num:nums){
            int abs = Math.abs(num);
            if(nums[abs-1]<0){    //  not repetitive
                rep = abs;
            }
            nums[abs-1] = -nums[abs-1];
            diff -= abs;
        }
        return new int[]{rep, rep+diff};
    }
}
