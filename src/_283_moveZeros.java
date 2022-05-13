public class _283_moveZeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==1) return;
        int z = 0;
        int nz = 0;
        while(z<n){
            while(z<n && nums[z]!=0) z++;
            nz = z+1;
            while(nz<n && nums[nz]==0) nz++;
            if(nz<n){
                int tmp = nums[z];
                nums[z] = nums[nz];
                nums[nz] = tmp;
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        //  int[] nums = {0, 1, 0, 3, 12};
        //  quicker???
        int[] nums = {0, 0, 0, 0};
        moveZeroes(nums);
        for(int num: nums){
            System.out.printf("%d, ", num);
        }
    }
}
