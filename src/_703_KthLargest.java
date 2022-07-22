import java.util.PriorityQueue;

public class _703_KthLargest {
    class KthLargest {
        final PriorityQueue<Integer> q;
        int k;
        public KthLargest(int k, int[] nums) {
            this.k = k;
            q = new PriorityQueue<>(k);
            for(int num:nums){
                add(num);
            }
        }

        public int add(int val) {
            if(q.size()<k){
                q.offer(val);
            }else if(q.peek()<val){
                q.poll();
                q.offer(val);
            }
            return q.peek();
        }
    }
}
