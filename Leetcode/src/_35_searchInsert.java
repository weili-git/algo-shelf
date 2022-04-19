public class _35_searchInsert {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target)
                return i;
        }
        return nums.length;
    }
    public static int searchInsert1(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left<=right){
            int middle = (left + right) / 2;
            if(nums[middle]<target){
                left = middle + 1;
            }
            else if(nums[middle]>target){
                right = middle - 1;
            }else {
                return middle;
            }
        }
        return left;    // right + 1?
    }

    public static void main(String[] args) {    // binary search
        int[] nums = {1, 2, 4, 8, 10};
        System.out.println(searchInsert1(nums, 0));
    }
}
