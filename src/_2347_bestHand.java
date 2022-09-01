public class _2347_bestHand {
    public String bestHand(int[] ranks, char[] suits) {
        if(suits[0]==suits[1] && suits[1]==suits[2] && suits[2]==suits[3] && suits[3]==suits[4]) return "Flush";
        int[] cnt = new int[13];
        int max = 1;
        for(int rank:ranks){
            cnt[rank-1]++;
            max = Math.max(max, cnt[rank-1]);
        }
        if(max==2) return "Pair";
        if(max>=3) return "Three of a Kind";
        return "High Card";
    }
}
