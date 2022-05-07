public class _155_MinStack {
    private int[] ss;
    private int count;
    private int size;

    public _155_MinStack() {
        ss = new int[10];
        size = 10;
        count = 0;
    }

    public void push(int val) {
        if(count<size){
            ss[count++] = val;
        }else{
            size = size*2+1;
            int[] ss_ = new int[size];
            for(int i=0;i<count;i++){
                ss_[i] = ss[i];
            }
            ss_[count++] = val;
            ss = ss_;
        }
    }

    public void pop() {
        if(count>0) count--;
    }

    public int top() {
        if(count>0) return ss[count-1];
        else return -1;
    }

    public int getMin() {
        int min = ss[0];
        for(int i=1;i<count;i++){
            min = Math.min(min, ss[i]);
        }
        return min;
    }
}
