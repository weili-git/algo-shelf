import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _229_majorityElement {
    public List<Integer> majorityElement(int[] nums) {  // 摩尔投票法: 在任何数组中，出现次数大于该数组长度1/3的值最多只有两个
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int len = nums.length;
        for(int i=0;i<len;i++){
            int pre = nums[i];
            int cnt = 1;
            while(i+1<len && nums[i]==nums[i+1]){
                cnt++;
                i++;
            }
            if(cnt>len/3) res.add(nums[i]);
        }
        return res;
    }
}
