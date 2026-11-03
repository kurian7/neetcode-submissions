class TrieNode{
    Map<Character, TrieNode> children = new HashMap<>();
    boolean lastWord = false;
}
class WordDictionary {
    private TrieNode root;
    
    public WordDictionary() {
     root = new TrieNode();
    }

    public void addWord(String word) {
     TrieNode cur = root;
     for(char c : word.toCharArray()){
        cur.children.putIfAbsent(c, new TrieNode());
        cur = cur.children.get(c);
     }
     cur.lastWord = true;
    }

    public boolean search(String word) {
     return dfs(word,0,root);
    }
    private boolean dfs(String word, int j, TrieNode root){
        TrieNode cur = root;
        for(int i =j; i<word.length() ; i++){
            char c =word.charAt(i);
            if( c == '.'){
                for(TrieNode chi : cur.children.values()){
                    if(chi !=null && dfs(word, i+1, chi)){
                        return true;
                    }
                }
              return false;
            }
            else if (!cur.children.containsKey(c))
               return false;
            cur = cur.children.get(c);
        }
        return cur.lastWord;
    }
}
