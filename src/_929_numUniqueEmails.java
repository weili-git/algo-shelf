import java.util.HashSet;

public class _929_numUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char ch;
        for(String str:emails){
            sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                ch = str.charAt(i);
                if(ch=='+') {
                    while(ch!='@') ch = str.charAt(++i);
                    i--;
                }
                else if(ch=='.') continue;
                else if(ch=='@') {
                    sb.append(str.substring(i,str.length()));
                    break;
                }else sb.append(ch);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
