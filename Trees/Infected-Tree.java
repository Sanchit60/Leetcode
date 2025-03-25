class Solution {  

    HashMap<TreeNode, TreeNode> map = new HashMap<>();
    TreeNode infected = null;
    public void travel(TreeNode node, TreeNode par, int infectedValue){
        if(node == null){
            return;
        }
        if(node.val == infectedValue){
            infected = node;
        }
        map.put(node, par);
        travel(node.left, node, infectedValue);
        travel(node.right, node, infectedValue);
    }
    public int amountOfTime(TreeNode root, int start) {
        travel(root, null, start);
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(infected);
        Set<TreeNode> isInfected = new HashSet<>();
        int time = 0;
        while(q.size() > 0){
            int size = q.size();
            while(size-- > 0){
                TreeNode rem = q.removeFirst();
                isInfected.add(rem);
                if(rem.left != null && !isInfected.contains(rem.left)){
                    q.addLast(rem.left);
                }
                if(rem.right != null && !isInfected.contains(rem.right)){
                    q.addLast(rem.right);
                }
                TreeNode par = map.get(rem);
                if(par != null && !isInfected.contains(par)){
                    q.addLast(par);
                }
            }
            time++;
        }
        return time - 1;  

    }
       
}
