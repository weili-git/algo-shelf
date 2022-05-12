public class _189_rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==1 || k%n==0) return;
        int[] res = new int[n];
        k = k%n;
        for(int i=0;i<n;i++){
            int offset = (i-k)>=0?(i-k):(i-k+n);
            res[i] = nums[offset];
        }
        System.arraycopy(res, 0, nums, 0, n);
    }
}
