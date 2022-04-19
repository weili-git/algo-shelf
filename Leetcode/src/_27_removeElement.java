public class _27_removeElement {
    public static int removeElement(int[] nums, int val) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                if(p!=i) {
                    nums[p++] = nums[i];
                }else {
                    p++;
                }
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int [] nums = {3, 5, 3};
        int n = removeElement(nums, 3);
        if(n==0) return;
        for(int i=0;i<n-1;i++){
            System.out.printf("%d->", nums[i]);
        }
        System.out.printf("%d\n", nums[n-1]);
    }
}
