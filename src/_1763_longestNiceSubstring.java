import java.util.HashSet;
import java.util.Set;

public class _1763_longestNiceSubstring {
    public String longestNiceSubstring(String s) { // YazAy,每次递归都有自己的一个表
        //因为当字符串都凑不成两个 就更不可能凑对子了就更不用说是美好子串 果断返回空字符串 这里是递归的终止条件
        if(s.length()<2)return "";
        //利用Set存储字符
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()){
            set.add(c);
        }
        //遍历字符
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            //如果当前Set中同时存在大写与小写字符时 则跳过当前字符 判定下一个字符
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c)))continue;
            //如果没有同时存在大小写字符时 该字符位置则为 递归的下标位置 分治 左右两边的字符串重复上述操作
            String leftStr = longestNiceSubstring(s.substring(0, i));
            String rightStr = longestNiceSubstring(s.substring(i + 1));
            return leftStr.length() >= rightStr.length() ? leftStr : rightStr;
        }
        //返回的是同时存在大小写字符的较长字符串 也就是咱们说的美好字符串 最长的那个 分而治之求解
        return s;
    }
}
