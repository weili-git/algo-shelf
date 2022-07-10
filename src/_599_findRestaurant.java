import java.util.ArrayList;
import java.util.List;

public class _599_findRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        // 索引和最小
        List<String> res = new ArrayList<>();
        int n1 = list1.length;
        int n2 = list2.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j==min){
                        res.add(list1[i]);
                    }else if(i+j<min){
                        min = i+j;
                        res.clear();
                        res.add(list1[i]);
                    }
                }
            }
        }
        return (String[])res.toArray(new String[0]);
    }
}
