import java.util.HashMap;
import java.util.Map;

public class _13_romanToInt {
    public static int romanToInt(String s){
        int result = 0;
        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                if(i<len-1){
                    char next = s.charAt(i+1);
                    if(next=='V'){
                        result += 4;
                        i++;
                        continue;
                    }
                    else if(next=='X'){
                        result += 9;
                        i++;
                        continue;
                    }
                }
                result += 1;
            }
            else if(ch=='V'){
                result += 5;
            }
            else if(ch=='X'){
                if(i<len-1){
                    char next = s.charAt(i+1);
                    if(next=='L'){
                        result += 40;
                        i++;
                        continue;
                    }
                    else if(next=='C'){
                        result += 90;
                        i++;
                        continue;
                    }
                }
                result+=10;
            }
            else if(ch=='L'){
                result+=50;
            }
            else if(ch=='C'){
                if(i<len-1){
                    char next = s.charAt(i+1);
                    if(next=='D'){
                        result+=400;
                        i++;
                        continue;
                    }
                    else if(next=='M'){
                        result+=900;
                        i++;
                        continue;
                    }
                }
                result+=100;
            }
            else if(ch=='D'){
                result+=500;
            }
            else if(ch=='M'){
                result+=1000;
            }
        }

        return result;
    }

    public static int romanToInt2(String s) {
        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            int value = symbolValues.get(s.charAt(i));
            if (i < n - 1 && value < symbolValues.get(s.charAt(i + 1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt2(s));
    }
}
