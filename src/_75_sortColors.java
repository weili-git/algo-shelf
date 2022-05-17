public class _75_sortColors {
    public void sortColors(int[] nums) {//[1, 2, 0]
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        // 遇见0就往前挪，遇到2就往后挪
        for(int k=0;k>=i&&k<=j;k++){
            if(nums[k]==0){
                if(k>i){
                    nums[k] = nums[i];
                    nums[i] = 0;
                    k--;    //  还不能移动，需要重新判断nums[k]的情况
                }
                i++;
            }else if(nums[k]==2){
                if(k<j){
                    nums[k] = nums[j];
                    nums[j] = 2;
                    k--;
                }
                j--;
            }
        }
    }
}
