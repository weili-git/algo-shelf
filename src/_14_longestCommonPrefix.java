public class _14_longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String LCP = strs[0];
        for(int i=1;i<strs.length;i++) {
            int j=0;
            while(j<LCP.length() && j<strs[i].length() && LCP.charAt(j)==strs[i].charAt(j)){    // be careful
                j++;
            }
            // System.out.println(j);
            if(j>0)
                LCP = LCP.substring(0, j);      // be careful
            else
                LCP = "";
        }
        return LCP;
    }

    public static void main(String[] args) {
        String [] strs = {"flower", "flow", "floor"};
        System.out.println(longestCommonPrefix(strs));
    }
}
