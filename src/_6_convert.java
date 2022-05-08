public class _6_convert {
    public static String convert(String s, int numRows) {
        //  1: (N-1)*2  (N-1)*2
        //  2: (N-2)*2  2
        //  3: (N-3)*2  4
        //  4: (N-4)*2  6
        //  ...
        //N-1: 2        (N-2)*2
        //  N: (N-1)*2  (N-1)*2
        if(s.length()<=2 || numRows==1) return s;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=2*numRows-2){ // 处理第一行
            sb.append(s.charAt(i));
        }
        boolean flag = true;
        for(int r=1;r<numRows-1;r++){   // 处理2~N-1行
            for(int i=r;i<s.length();){
                sb.append(s.charAt(i));
                if(flag){
                    i += (numRows-r-1)*2;
                    flag = false;
                }else{
                    i += r*2;
                    flag = true;
                }
            }
            flag = true;
        }
        for(int i=numRows-1;i<s.length();i+=2*numRows-2){ // 处理第N行
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
