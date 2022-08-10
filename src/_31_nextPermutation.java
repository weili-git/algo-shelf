import java.util.Arrays;

public class _31_nextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n<=1) return;
        for(int i=n-1;i>0;i--){
            if(nums[i] > nums[i-1]){    //  1, 2, [5], 7, [6], 4, 3
                int j;
                for(j=n-1;j>i-1;j--){   // first bigger than nums[i-1], swap them.
                    if(nums[j]>nums[i-1]) break;
                }
                int tmp = nums[j];    //  swap nums[i-1] and nums[j]
                nums[j] = nums[i-1];
                nums[i-1] = tmp;
                Arrays.sort(nums, i, n);    //  tail reverse
                return;
            }
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        // 2, 3, 1
        int[] nums = {1, 2, 3, 4};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.printf("%d, ", nums[i]);
        }
    }
}
