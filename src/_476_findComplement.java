public class _476_findComplement {
    public int findComplement(int num) {
        int res = 0;
        int i=31;
        while((num>>i)%2==0) i--;
        while(i>=0){
            res = res << 1;
            res += ((num>>i)%2) ^ 1;
            i--;
        }
        return res;
    }
}
