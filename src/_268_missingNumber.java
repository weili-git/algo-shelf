public class _268_missingNumber {
    public int missingNumber(int[] nums) {
        int res = nums.length*(nums.length+1)/2;    // 可能会溢出
        for(int num:nums){
            res-=num;
        }
        return res;
        // 另外也可以每次与循环变量i和num异或或者加减法
    }
}
