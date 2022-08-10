public class _33_search {
    public static int search(int[] nums, int target) {
        // [1, 3] 3 ; [3, 1] 1
        // a little difficult
        int len = nums.length;
        int left = 0, right = len-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < nums[right]){   // 右区间单调
                if(nums[mid] < target && target <= nums[right]) // 并且target在其中
                    left = mid+1;
                else
                    right = mid-1;
            }
            else{   // 左区间单调
                if(nums[left] <= target && target < nums[mid])  // 并且target在其中
                    right = mid-1;
                else
                    left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 2, 3};
        System.out.println(search(nums, 2));
    }
}
