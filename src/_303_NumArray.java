import java.util.HashMap;
import java.util.Map;

public class _303_NumArray {
    class NumArray{
        private int[] sumArr;
        public NumArray(int[] nums){
            sumArr = nums;
            for(int i=1;i<nums.length;i++){
                sumArr[i] += sumArr[i-1];
            }
        }
        public int sumRange(int left, int right){
            return left==0?sumArr[right]:sumArr[right] - sumArr[left-1];
        }
    }
}
