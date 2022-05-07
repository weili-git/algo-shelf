public class _28_strStr {
    // 1. pi(i) <= pi(i-1) + 1
    // Each time, pi(i) increase at most 1. For example, aab...aab => aabc...aabd
    // 2. if s[i] = s[pi(i-1)], then pi(i) = pi(i-1) + 1    ...
    public static int strStr(String haystack, String needle) {
        // 字符串匹配算法KMP
        int n = haystack.length();
        int m = needle.length();
        if(m==0){
            return 0;
        }
        int [] pi = new int[m];
        for(int i=1,j=0;j<m;i++){   // KMP
            while(j>0 && needle.charAt(i) != needle.charAt(j)){
                j = pi[j-1];
            }
            if(needle.charAt(i)==needle.charAt(j)){
                j++;
            }
            pi[i]=j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
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
