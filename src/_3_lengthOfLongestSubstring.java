import java.util.HashSet;
import java.util.Set;

public class _3_lengthOfLongestSubstring {
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> occ = new HashSet<Character>();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static int ss(String s){
        Set<Character> dict = new HashSet<Character>();
        int n = s.length();
        if(n==0){   // case 1
            return 0;
        }
        int max = 0;
        int left = 0, right = 0;
        while(left<n && right<n){
            while(right<n && !dict.contains(s.charAt(right))){  // "abcabassa" 左边条件先判断！！
                dict.add(s.charAt(right));
                right++;
            }
            max = Math.max(max, right - left);
            if(right>=n){   //  不能让right=n的时候走到下面的循环，会数组越界
                break;
            }
            while(s.charAt(left)!=s.charAt(right)){
                dict.remove(s.charAt(left));
                left++;
            }
            left++;
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "abcabassa";
        System.out.println(ss(s));
    }
}
