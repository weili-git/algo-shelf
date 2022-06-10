import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _401_readBinaryWatch {
    List<String> res = new LinkedList<>();
    int[] clock = {1, 2, 4, 8, 16, 32, 1, 2, 4, 8}; // 不允许min进位到hour
    int min = 0;
    int hour = 0;
    public List<String> readBinaryWatch(int turnedOn) {
        backtrace(turnedOn, 0);
        return res;
    }
    private void backtrace(int turnedOn, int index){
        if(index>=10 && turnedOn!=0) return;
        else if(hour>11 || min>59) return;
        else if(turnedOn==0){
            res.add(hour+":"+String.format("%02d",min));
        }else{
            if(index<6){
                min += clock[index];
                backtrace(turnedOn-1, index+1);
                min -= clock[index];
                backtrace(turnedOn, index+1);
            }else{
                hour += clock[index];
                backtrace(turnedOn-1, index+1);
                hour -= clock[index];
                backtrace(turnedOn, index+1);
            }

        }
    }
}
