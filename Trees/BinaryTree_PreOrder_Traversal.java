class Solution {
    public void preTraversal(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        preTraversal(root.left, ans);
        preTraversal(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        preTraversal(root, ans);
        return ans;        
    }
}
