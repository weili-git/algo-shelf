import java.util.Arrays;

public class _55_canJump {
    public boolean canJump(int[] nums){
        int n = nums.length;
        if(nums[0]>=n-1) return true;
        for(int i=n-2;i>=0;){
            if(nums[i]==0){
                int j=i-1;
                for(;j>=0;j--){
                    if(j+nums[j]>i) {
                        i = j;
                        break;
                    }
                }
                if(j==-1) return false;
            }else{
                i--;
            }
        }
        return true;
    }
//    public boolean canJump(int[] nums) {
//        int pos = 0;
//        boolean[] vis = new boolean[nums.length];
//        Arrays.fill(vis, false);
//        return helper(nums, pos, vis);
//    }
//    private boolean helper(int[] nums, int pos, boolean[] vis){    //  time-out 剪枝
//        vis[pos] = true;
//        int n = nums.length;
//        if(pos>=n-1) return true;
//        else{
//            for(int i=1;i<=nums[pos];i++){
//                if(vis[pos+i]) continue;
//                if(helper(nums, pos+i, vis)) return true;
//            }
//            return false;
//        }
//    }
}
