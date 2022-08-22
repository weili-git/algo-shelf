import java.util.*;

public class _2053_kthDistinct {
    public String kthDistinct(String[] arr, int k) {//没看完字符串，不能得出结果！！！
//        Set<String> set  = new HashSet<>(); // appear once
//        Set<String> rep = new HashSet<>();  // appear more than once
//        for(String str: arr){
//            if(set.contains(str)){
//                if(!rep.contains(str)){
//                    rep.add(str);
//                    k++;
//                }
//            }else{
//                set.add(str);
//                k--;
//            }
//            if(k==0) return str;
//        }
//        return "";

        // java的HashMap是无序的，但是原来的数组就是有序的，用来计数
        if(arr.length<k) return "";
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int i = 0;
        for(String s:arr){
            if(map.get(s)==1) i++;
            if(i==k) return s;
        }
        return "";

    }
}
