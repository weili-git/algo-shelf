public class _45_jump {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int reach = 0;
        int next = nums[0];
        int step = 0;
        for(int i=0;i<nums.length;i++){
            next = Math.max(i+nums[i], next);
            if(next>=nums.length-1) return step+1;
            if(i==reach){
                step++;
                reach = next;
            }
        }
        return step;
        //       /-------\
        //  [2, 3, 1, 1, 4]
        //   \-----/
        //  [0, 1, 1, 2, 2]
        }
}
