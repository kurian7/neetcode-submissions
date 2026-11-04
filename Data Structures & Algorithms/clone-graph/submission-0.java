/*
Definition for a Node.
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
*/

class Solution {
    public Node cloneGraph(Node node) {
      if(node == null)
        return null;
      Map<Node, Node> mp = new HashMap<>();
      Queue<Node> q = new LinkedList<>();
      mp.put(node, new Node(node.val));
      q.offer(node);

      while(!q.isEmpty()){
        Node cur =q.poll();
        for(Node i : cur.neighbors){
            if(!mp.containsKey(i)){
                mp.put(i, new Node(i.val));
                q.offer(i);
            }
            mp.get(cur).neighbors.add(mp.get(i));
        }
      }   
      return mp.get(node);
    }
}