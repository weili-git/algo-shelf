public class _26_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[n]){
                continue;
            }
            nums[++n] = nums[i];
        }
        return n+1;
    }
    public static void main(String[] args) {
        int [] nums = {1, 1, 2};
        int n = removeDuplicates(nums);
        for(int i=0;i<n-1;i++){
            System.out.printf("%d, ", nums[i]);
        }
        System.out.printf("%d\n", nums[n-1]);
    }
}
