public class _374_guessNumber {
    public int guessNumber(int n) {
        int left=1;
        int right = n;
        int mid = left+(right-left)/2;
        while(true){
            if(guess(mid)==-1) {       // num>pick
                right=mid-1;
                mid = left+(right-left)/2;
            }else if(guess(mid)==1){    // num<pick
                left=mid+1;
                mid = left+(right-left)/2;
            }else{
                return mid;
            }
        }
    }
    private int guess(int mid){
        return 1;
    }
}
