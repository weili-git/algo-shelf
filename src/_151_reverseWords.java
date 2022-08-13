public class _151_reverseWords {
    public String reverseWords(String s) {
        String[] split = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i= split.length-1;i>0;i--){
            sb.append(split[i]);
            sb.append(" ");
        }
        sb.append(split[0]);
        return sb.toString();
    }
}
