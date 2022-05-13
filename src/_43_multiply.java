public class _43_multiply {
    public String multiply(String num1, String num2) {
        if(num1.length()==0||num2.length()==0) return "0";
        if(num1.equals("0")||num2.equals("0")) return "0";
        int n1 = num1.length();
        int n2 = num2.length();
        int[] arr = new int[n1+n2];
        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int tmp = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                tmp += arr[i+j+1];
                arr[i+j] = arr[i+j]+tmp/10;     // carry
                arr[i+j+1] = tmp%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n1+n2;i++){
            sb.append(arr[i]);
        }
        // 06
        int a=0;
        while(sb.charAt(a)=='0') a++;
        return sb.substring(a);
    }
}
