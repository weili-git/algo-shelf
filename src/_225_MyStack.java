import java.util.ArrayDeque;
import java.util.Queue;

public class _225_MyStack {
    class MyStack{
        Queue<Integer> q;
        int size;
        public MyStack() {
            q = new ArrayDeque<>();
            size = 0;
        }

        public void push(int x) {
            q.add(x);
            size++;
        }

        public int pop() {
            // if(size == 0) throw new ...;
            for(int i=0;i<size-1;i++){
                q.add(q.remove());
            }
            size--;
            return q.remove();
        }

        public int top() {
            for(int i=0;i<size-1;i++){
                q.add(q.remove());
            }
            int res = q.remove();
            q.add(res);
            return res;
        }

        public boolean empty() {
            return size==0;
        }
    }
}
