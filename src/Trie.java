public class Trie {

    private class TrieNode{
        private boolean isEnd;
        private TrieNode[] next;
        public TrieNode() {
            isEnd = false;
            next = new TrieNode[26];
        }
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {   // no delete
        TrieNode cur = root;
        for(int i=0, len=word.length(), ch;i<len;i++){
            ch = word.charAt(i) - 'a';
            if(cur.next[ch]==null){
                cur.next[ch] = new TrieNode();
            }
            cur = cur.next[ch];
        }
        cur.isEnd = true;   // 标记为一个单词
    }

    public boolean search(String word) {
        TrieNode cur = root;
        for(int i=0,len=word.length(),ch;i<len;i++){
            ch = word.charAt(i) - 'a';
            if(cur.next[ch]==null) return false;
            cur = cur.next[ch];
        }
        return cur.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for(int i=0,len=prefix.length(),ch;i<len;i++){
            ch = prefix.charAt(i) - 'a';
            if(cur.next[ch]==null) return false;
            cur = cur.next[ch];
        }
        return true;
    }
}
