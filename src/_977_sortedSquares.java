import java.util.Arrays;

public class _977_sortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        if(n<5){
            for(int i=0;i<n;i++){
                res[i] = nums[i] * nums[i];
            }
            Arrays.sort(res);
            return res;
        }
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]<0){
                left = mid+1;
            }else if(nums[mid]>0){
                right = mid-1;
            }else{
                left = mid;
                break;
            }
        }
        left--;
        right = left + 1;
        int i=0;
        while(left>=0 && right<n){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                res[i++] = nums[right] * nums[right];
                right++;
            }else{
                res[i++] = nums[left] * nums[left];
                left--;
            }
        }
        while(left>=0){
            res[i++] = nums[left] * nums[left];
            left--;
        }
        while(right<n){
            res[i++] = nums[right] * nums[right];
            right++;
        }
        return res;
    }

    public static void main(String[] args) {
        //  int[] nums = {-5, -3, -2, 0, 1, 3, 5, 6};
        //  int[] nums = {0, 1, 2, 3, 4, 5, 6};
        //  int[] nums = {-4, -3, -2, 0, 1, 2, 3, 4, 5, 6};
        int[] nums = {-4, -3, -2, 3, 3};
        nums = sortedSquares(nums);
        for(int num: nums){
            System.out.printf("%d, ",num);
        }
    }
}
