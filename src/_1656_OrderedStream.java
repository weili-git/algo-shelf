import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1656_OrderedStream {
    // 有序流的应用场景：随机到达的数据存放在缓冲区
    class OrderedStream {
        private String[] list;
        int ptr = 1;    // 串行数据指针
        public OrderedStream(int n) {
            list = new String[n+2];
        }

        public List<String> insert(int idKey, String value) {
            list[idKey] = value;
            if(ptr==idKey){
                List<String> ans = new ArrayList<>();
                while(list[ptr]!=null){
                    ans.add(list[ptr]);
                    ptr++;
                }
                return ans;
            }
            return new ArrayList<>();
        }
    }
}
