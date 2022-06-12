public class _415_addStrings {
    public static String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int max_len = Math.max(len1, len2);
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i=1;i<=max_len;i++){
            int d1 = i<=len1?(int)num1.charAt(len1-i)-'0':0;
            int d2 = i<=len2?(int)num2.charAt(len2-i)-'0':0;
            int sum = d1 + d2 + carry;
            sb.append(sum%10);
            carry = sum/10;
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "234"));
    }
}
