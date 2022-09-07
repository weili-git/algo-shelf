import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _187_findRepeatedDnaSequences {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        if(len<=10) return res;
        // 用整数来表示一个DNA sequence
        // 00 A 01 C 10 G 11 T
        // 10位DNA需要20bits空间
        Map<Integer, Integer> map = new HashMap<>();    // 统计次数
        int dna = 0;
        for(int i=0;i<10;i++){
            dna = dna<<2;
            switch (s.charAt(i)) {
                // case 'A' -> dna += 0;
                case 'C' -> dna += 1;
                case 'G' -> dna += 2;
                case 'T' -> dna += 3;
            }
        }
        map.put(dna, 1);
        for(int j=10;j<len;j++){
            dna = dna & 0x0003FFFF;
            dna = dna<<2;
            switch (s.charAt(j)) {
                // case 'A' -> dna += 0;
                case 'C' -> dna += 1;
                case 'G' -> dna += 2;
                case 'T' -> dna += 3;
            }
            map.put(dna, map.getOrDefault(dna, 0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>1){
                res.add(toSeq(k));
            }
        }
        return res;
    }
    private String toSeq(int seq){
        StringBuilder sb = new StringBuilder();
        while(sb.length()<10){
            int digit = seq % 4;
            switch (digit){
                case 0 -> sb.append('A');
                case 1 -> sb.append('C');
                case 2 -> sb.append('G');
                case 3 -> sb.append('T');
            }
            seq = seq >> 2;
        }
        return sb.reverse().toString();
    }
}
