import java.util.Arrays;

public class _748_shortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int[] count = new int[26];
        int sum = 0;
        for(char ch:licensePlate.toCharArray()){
            if(ch>='a'&&ch<='z'){
                count[ch-'a']++;
                sum++;
            }else if(ch>='A'&&ch<='Z'){
                count[ch-'A']++;
                sum++;
            }

        }
        for(String word:words){
            int[] arr = Arrays.copyOf(count, count.length);
            int sum_ = 0;
            for(char ch:word.toCharArray()){
                if(arr[ch-'a']>0){
                    arr[ch-'a']--;
                    sum_++;
                }
                if(sum_==sum) return word;
            }
        }
        return "";
    }
}
