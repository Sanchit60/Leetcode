class Solution {
    public class Pair implements Comparable<Pair>{
        TreeNode node;
        int vidx;
        int hidx;
        Pair(TreeNode node, int vidx, int hidx){
            this.node = node;
            this.vidx = vidx;
            this.hidx = hidx;
        }
        public int compareTo(Pair o){
            if(this.hidx == o.hidx){
                return this.node.val - o.node.val;
            }else{
                return this.hidx - o.hidx;
            }
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root){
        TreeMap<Integer, List<Pair>> map = new TreeMap<>();
        LinkedList<Pair> q = new LinkedList<>();
        int level = 1;
        q.addLast(new Pair(root, 0, level));
        while(q.size() != 0){
            int size = q.size();
            while(size-- != 0){
                Pair rem = q.removeFirst();
                int vidx = rem.vidx;
                if(map.containsKey(vidx)){
                    List<Pair> li = map.get(vidx);
                    li.add(rem);
                }else{
                    List<Pair> li = new ArrayList<>();
                    li.add(rem);
                    map.put(vidx, li);
                }
                if(rem.node.left != null){
                    q.addLast(new Pair(rem.node.left, vidx - 1, level + 1));
                }
                if(rem.node.right != null){
                    q.addLast(new Pair(rem.node.right, vidx + 1, level + 1));
                }
            }
            level = level + 1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            List<Pair> li = map.get(key);
            Collections.sort(li);
            List<Integer> li2 = new ArrayList<>();
            for(Pair p : li){
                li2.add(p.node.val);
            } 
            ans.add(li2);
        }
        return ans;
    }    
}
