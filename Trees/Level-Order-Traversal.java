class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        int level = 1;
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        while(q.size() != 0){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            while(size != 0){
                TreeNode rem = q.removeFirst();
                li.add(rem.val);
                if(rem.left != null){
                    q.addLast(rem.left);
                }
                if(rem.right != null){
                    q.addLast(rem.right);
                }
                size--;
            }
            level++;
            ans.add(li);
        }
        return ans;        
    }
}
