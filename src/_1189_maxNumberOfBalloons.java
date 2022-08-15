public class _1189_maxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[5]; // balloon
        for(char ch: text.toCharArray()){
            if(ch=='b'){
                count[0]++;
            }else if(ch=='a'){
                count[1]++;
            }else if(ch=='l'){
                count[2]++;
            }else if(ch=='o'){
                count[3]++;
            }else if(ch=='n'){
                count[4]++;
            }
        }
        int res1 = Math.min(count[0], count[1]);
        res1 = Math.min(res1, count[4]);
        int res2 = Math.min(count[2]/2, count[3]/2);
        return Math.min(res1, res2);
    }
}
