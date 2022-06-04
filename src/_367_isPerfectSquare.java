public class _367_isPerfectSquare {
    public static boolean isPerfectSquare(int num) {//5
        if(num==1) return true;
        int guess = num/2;
        int upper = guess;
        while(true){
            // System.out.println(guess);
            if(guess > num/guess){  // overflow
                upper = guess;
                guess /= 2;
            }else if(guess < num/guess){
                int tmp = guess;
                guess = guess + (upper-guess)/2;
                if(guess==tmp) return false;
            }
            else {
                if(num%guess==0) return true;
                else return false;
            }
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<1025;i++){
            if(isPerfectSquare(i)) System.out.println(i);
        }
    }
}
