public class _409_longestPalindrome {
    public int longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[128];
        for(char ch:arr){
            count[ch]++;
        }
        int len = 0;
        for(int num:count){
            len+=num/2*2;
            if(num%2==1 && len%2==0){
                len++;
            }
        }
        return len;
    }
}
