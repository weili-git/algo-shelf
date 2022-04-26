public class _136_singleNumber {
    public static int singleNumber(int[] nums) {
        int a = 0;
        for(int i=0;i<nums.length;i++) a = a^nums[i];
        return a;
        // 异或运算，相同为0；与0异或，结果不变。
    }
}
