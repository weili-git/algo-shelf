public class _482_licenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        char[] arr = s.toCharArray();
        int count=0;
        for(char ch:arr){
            if(ch!='-'){
                count++;
            }
        }
        int first = count%k==0?k:count%k;
        StringBuilder sb = new StringBuilder();
        for(char ch:arr){
            if(ch=='-') continue;
            if(first>0){
                if(ch>='a' && ch<='z'){
                    sb.append((char)(ch+'A'-'a'));
                }else{
                    sb.append(ch);
                }
                first--;
            }else{
                sb.append('-');
                if(ch>='a' && ch<='z'){
                    sb.append((char)(ch+'A'-'a'));
                }else{
                    sb.append(ch);
                }
                first = k-1;
            }
        }
        return sb.toString();
    }
}
