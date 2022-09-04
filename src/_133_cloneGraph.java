import java.util.*;

public class _133_cloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) { //BFS
        if(node==null)  return null;
        Deque<Node> q = new LinkedList<>();
        q.offer(node);
        Map<Integer, Node> map = new HashMap<>();
        map.put(node.val, new Node(node.val));
        while (!q.isEmpty()) {
            Node source = q.poll();
            List<Node> nodes = source.neighbors;
            Node dest = map.get(source.val);
            for (Node n: nodes) {
                if (!map.containsKey(n.val)) {
                    q.offer(n);
                    map.put(n.val, new Node(n.val));
                }
                dest.neighbors.add(map.get(n.val));
            }
        }
        return map.get(node.val);
    }
}
