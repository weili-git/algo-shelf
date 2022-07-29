import java.util.Arrays;

public class _937_reorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(log1, log2)->{
            String[] str1 = log1.split(" ", 2);// 分成两份，分离标识符
            String[] str2 = log2.split(" ", 2);
            boolean is_digit1 = Character.isDigit(str1[1].charAt(0));
            boolean is_digit2 = Character.isDigit(str2[1].charAt(0));
            if(!is_digit1 && !is_digit2){
                int cmp = str1[1].compareTo(str2[1]);
                if(cmp!=0) return cmp;
                return str1[0].compareTo(str2[0]);
            }
            return is_digit1?(is_digit2?0:1):-1;
        });
        return logs;
    }
}
