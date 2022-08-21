import java.util.HashSet;
import java.util.Set;

public class _1805_numDifferentIntegers {
    public int numDifferentIntegers(String word) {// thinking
        char[] nums = word.toCharArray();
        HashSet<String> set = new HashSet();
        for(int i = 0;i < nums.length;i++){
            if(nums[i] <= '9' && nums[i] >= '0'){
                //用一个left记录左边的位置，当左边的字符是 '0' 时，更新i，left
                int left = i;
                while(i < nums.length && nums[left] == '0'){
                    left++;
                    i++;
                }
                //遍历到的元素是数字时，i++
                while(i < nums.length && nums[i] >= '0' && nums[i] <= '9'){
                    i++;
                }
                //将子字符串保存下来，添加到HashSet中
                String s = word.substring(left,i);
                set.add(s);
            }
        }
        return set.size();
    }
}
