public class _941_validMountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3) return false;
        if(arr[1]<arr[0]) return false;
        boolean increase = true;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                if(!increase) return false;
            }
            else if(arr[i]<arr[i-1]){
                if(increase){
                    increase = false;
                }
            }else{
                return false;
            }
        }
        return !increase;
    }
}
