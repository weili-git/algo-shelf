import java.util.ArrayList;
import java.util.List;

public class _228_summaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length==0) return res;
        int start = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]+1){
                if(start == nums[i-1]){// end a range
                    res.add(start+"");
                }else{
                    res.add(start+"->"+nums[i-1]);
                }
                start = nums[i];
            }
        }
        if(start == nums[nums.length-1]){// end a range
            res.add(start+"");
        }else{
            res.add(start+"->"+nums[nums.length-1]);
        }
        return res; // [6,6] --> "6"
    }
}
