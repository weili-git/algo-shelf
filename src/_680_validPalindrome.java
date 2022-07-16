public class _680_validPalindrome {
    public boolean validPalindrome(String s) {
        int i = 0, ii = 0;
        int j = s.length()-1, jj = s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{//(i+1,j) (i,j-1)
                ii = i;
                jj = j-1;
                while(ii<jj){
                    if(arr[ii]==arr[jj]){
                        ii++;
                        jj--;
                    }else{
                        break;
                    }
                }
                if(ii>=jj) return true;
                ii = i+1;
                jj = j;
                while(ii<jj){
                    if(arr[ii]==arr[jj]){
                        ii++;
                        jj--;
                    }else{
                        break;
                    }
                }
                return ii >= jj;
            }
        }
        return true;
    }
}
