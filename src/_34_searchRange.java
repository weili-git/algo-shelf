public class _34_searchRange {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] res = {-1, -1};
        boundary(nums, res, left, right, target);
        return res;
    }
    private static void boundary(int[] nums, int[] res, int left, int right, int target){
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]>target){
                right = mid-1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                if(res[0]==-1 && res[1]==-1){
                    res[0] = mid;
                    res[1] = mid;
                }else{
                    res[0] = Math.min(mid, res[0]);
                    res[1] = Math.max(mid, res[1]);
                }
                boundary(nums, res, left, mid-1, target);
                boundary(nums, res, mid+1, right, target);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8 ,10};
        int[] res = searchRange(nums, 8);
        System.out.printf("%d, %d\n", res[0], res[1]);
    }
}
