public class _165_compareVersion {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");    // 注意
        String[] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int i;
        for(i=0;i<Math.min(n1, n2);i++){
            if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])){
                return -1;
            }else if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])){
                return 1;
            }
        }
        while(i<n1){
            if(Integer.parseInt(v1[i])!=0){
                return 1;
            }
            i++;
        }
        while(i<n2){
            if(Integer.parseInt(v2[i])!=0){
                return -1;
            }
            i++;
        }
        return 0;
    }
}
