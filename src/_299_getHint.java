public class _299_getHint {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        int[] cnt1 = new int[10];
        int[] cnt2 = new int[10];
        int bull=0, cow=0;
        for(int i=0;i<len;i++){
            if(secret.charAt(i)==guess.charAt(i)) {
                bull++;
                continue;
            }
            cnt1[secret.charAt(i)-'0']++;
            cnt2[guess.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            cow += Math.min(cnt1[i], cnt2[i]);
        }
        return String.valueOf(bull) + "A" + String.valueOf(cow) + "B";
    }
}
