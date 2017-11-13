/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    private HashMap<Integer, UndirectedGraphNode> hm = new HashMap<>();
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null)     return null;
        
        if(hm.containsKey(node.label)){
            return hm.get(node.label);
        }
        UndirectedGraphNode ret = new UndirectedGraphNode(node.label);
        hm.put(ret.label, ret);
        for(UndirectedGraphNode neighbor : node.neighbors){ //iterate through the list
            ret.neighbors.add(cloneGraph(neighbor));
        }
        
        return ret;
    }
}
