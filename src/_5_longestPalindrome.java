import java.util.Stack;

public class _5_longestPalindrome {
    public String longestPalindrome(String s) {
        // dynamic programming
        int size = s.length();
        int maxlen = 0;
        int left = 0;
        int right = 0;
        boolean[][] dp = new boolean[size][size];
        for(int i=size-1;i>=0;i--){     // bottom to top
            for(int j=i;j<size;j++){    // left to right
                if(s.charAt(i)==s.charAt(j)){
                    if(j - i <= 1)  // case 1,2: a, aa
                        dp[i][j] = true;
                    else if (dp[i+1][j-1])  // case 3: ab..ba
                        dp[i][j] = true;
                }
                if(dp[i][j] && j-i+1>maxlen){
                    maxlen = j-i+1;
                    left = i;
                    right = j;
                }
            }
        }
        return s.substring(left, right+1);
    }
}

//    ## 动态规划
//
//    动规五部曲：
//
//    确定dp数组（dp table）以及下标的含义
//    布尔类型的dp[i][j]：表示区间范围[i,j] （注意是左闭右闭）的子串是否是回文子串，如果是dp[i][j]为true，否则为false。
//
//    情况一：下标i 与 j相同，同一个字符例如a，当然是回文子串
//    情况二：下标i 与 j相差为1，例如aa，也是文子串
//    情况三：下标：i 与 j相差大于1的时候，例如cabac，此时s[i]与s[j]已经相同了，我们看i到j区间是不是回文子串就看aba是不是回文就可以了，那么aba的区间就是 i+1 与 j-1区间，这个区间是不是回文就看dp[i + 1][j - 1]是否为true。

//    注意这里我没有列出当s[i]与s[j]不相等的时候，因为在下面dp[i][j]初始化的时候，就初始为false。

//    如果这矩阵是从上到下，从左到右遍历，那么会用到没有计算过的dp[i + 1][j - 1]，也就是根据不确定是不是回文的区间[i+1,j-1]，来判断了[i,j]是不是回文，那结果一定是不对的。
//    **所以一定要从下到上，从左到右遍历，这样保证dp[i + 1][j - 1]都是经过计算的**。
//    **注意因为dp[i][j]的定义，所以j一定是大于等于i的，那么在填充dp[i][j]的时候一定是只填充右上半部分**。