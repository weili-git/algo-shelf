public class _168_convertToTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber!=0){
            if(columnNumber%26==0){
                sb.append('Z');
                columnNumber--; // key point
            }
            else
                sb.append( (char) ((int)'A'+ (columnNumber%26-1) ) );
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
