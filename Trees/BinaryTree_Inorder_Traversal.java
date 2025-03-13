class Solution {
    public void inTraversal(TreeNode root, List<Integer> ans){
        if(root == null){
            return;
        }
        inTraversal(root.left, ans);
        ans.add(root.val);
        inTraversal(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inTraversal(root, ans);
        return ans;        
    }
}
