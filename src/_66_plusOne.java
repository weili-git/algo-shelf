public class _66_plusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};
        int[] res = plusOne(digits);
        for(int i=0;i<res.length-1;i++){
            System.out.printf("%d->", res[i]);
        }
        System.out.printf("%d\n", res[res.length-1]);
    }
}
