public class _896_isMonotonic {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n<=2) return true;
        int decrease = -1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                if(decrease==-1){
                    decrease = 1;
                }else if(decrease==0){
                    return false;
                }//else continue;
            }else if(nums[i]>nums[i-1]){
                if(decrease==-1){
                    decrease = 0;
                }else if(decrease==1){
                    return false;
                }//else continue;
            }//else continue;
        }
        return true;
    }
}
