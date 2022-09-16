import java.util.Arrays;

public class _976_largestPerimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int a = nums[i];
            int b = nums[i-1];
            int c = nums[i-2];
            if(a<b+c){
                return a+b+c;
            }
        }
        return 0;
    }
}
