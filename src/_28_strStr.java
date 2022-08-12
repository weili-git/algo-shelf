public class _28_strStr {
    public static int strStr(String haystack, String needle) {
        // 字符串匹配算法KMP
        int n = haystack.length();
        int m = needle.length();
        if(m==0){
            return 0;
        }
        int [] next = new int[m];   // next[]的值代表字符串前缀和后缀相同的最大长度（不包括自身）
        // a a b a a c b b
        // 0 1 0 1 2 0 0 0
        for(int i=1,j=0;j<m;i++){
            while(j>0 && needle.charAt(i) != needle.charAt(j)){
                j = next[j-1];
            }
            if(needle.charAt(i)==needle.charAt(j)){
                j++;
            }
            next[i]=j;
        }
        // a a b a a b a a c b b
        // a a b a a c  [j=5]
        //       a a b  [j=2]
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "ll";
        System.out.println(strStr(str1, str2));
    }
}
